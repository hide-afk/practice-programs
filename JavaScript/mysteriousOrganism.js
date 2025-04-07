// This is a project from the back-end carrer path from Codecademy!
// Challenge Project: Mysterious Organism

// Returns a random DNA base
const returnRandBase = () => {
  const dnaBases = ["A", "T", "C", "G"];
  return dnaBases[Math.floor(Math.random() * 4)];
};

// Returns a random single strand of DNA containing 15 bases
const mockUpStrand = () => {
  const newStrand = [];
  for (let i = 0; i < 15; i++) {
    newStrand.push(returnRandBase());
  }
  return newStrand;
};

// Step 3 & 4
function pAequorFactory(num, arr) {
  // Step 3
  return { 
  specimenNum: num, 
  dna: arr,
  // Step 4
  mutate(){
    let randomBasePosition = Math.floor(Math.random() * 15);
    let randomBaseChar = returnRandBase();
    while (arr[randomBasePosition] === randomBaseChar){
      randomBaseChar = returnRandBase();
    }
    this.dna[randomBasePosition] = randomBaseChar;
    return this.dna;
  },
  // Step 5
  compareDNA(pAequorObject){
    console.log(`Comparing DNA's from specimen nº${this.specimenNum} and specimen nº${pAequorObject.specimenNum}...`);
    console.log(`DNA from specimen nº${this.specimenNum}: ${this.dna.join('')}`);
    console.log(`DNA from specimen nº${pAequorObject.specimenNum}: ${pAequorObject.dna.join('')}`);
    let identicalBases = [];
    for (let i = 0; i < this.dna.length; i++){
      if (this.dna[i] === pAequorObject.dna[i]){
        identicalBases.push(this.dna[i]);
      }
    }
    const percentageOfDNA = (identicalBases.length / this.dna.length) * 100;
    console.log(`Specimen's DNA nº${this.specimenNum} & nº${pAequorObject.specimenNum} have ${percentageOfDNA}% in common`);
  },
  // Step 6
  willLikelySurvive(){
    let numberOfCsAndGs = 0;
    for (let i = 0; i < this.dna.length; i++){
      if (this.dna[i] === 'C' || this.dna[i] === 'G'){
        numberOfCsAndGs++
      }
    }
    let percentageOfCsAndGs = (numberOfCsAndGs / 15) * 100;
    // console.log(`Percentage of Cs and Gs: ${percentageOfCsAndGs}%`);
    if (percentageOfCsAndGs >= 60){
      return true
    } else {
      return false
    }
  }
  };
}

// Step 7
let thirtySurvivalInstances = [];
let i = 0;
while (i < 30){
  let prueba = pAequorFactory(i, mockUpStrand());
  if (prueba.willLikelySurvive()){
    i++;
    thirtySurvivalInstances.push(prueba);
  }
}

// VERIFICATIONS OF EACH STEP!
  // Step 3 verification:
    // console.log(pAequorFactory(1, mockUpStrand()));

  // Step 4 verification:
    // const test = pAequorFactory(1, mockUpStrand());
    // console.log(test.dna);
    // test.mutate();
    // console.log(test.dna);

  // Step 5 verification:
    // let pAequorTEST1 = pAequorFactory(1, mockUpStrand());
    // let pAequorTEST2 = pAequorFactory(2, mockUpStrand());
    // pAequorTEST1.compareDNA(pAequorTEST2);

  // Step 6 verification:
      // let pAequorTEST3 = pAequorFactory(3, mockUpStrand());
      // pAequorTEST3.willLikelySurvive();

  // Step 7 verification:
    // thirtySurvivalInstances.forEach((specimen) => {
    //   console.log(`Specimen #${specimen.specimenNum} - DNA: ${specimen.dna.join('')}`);
    //   console.log(`Will specimen #${specimen.specimenNum} likely survive? ${specimen.willLikelySurvive()}`);
    // });
