const nama = "Rasya Rifky";
let usia = 15;

let biodata = document.getElementById('biodata');

function generateBiodata() {
    let generasi;

    if (usia > 10 && usia < 18) {
generasi = "generasi remaja";
    }
    else if (usia >= 18 && usia <= 37) {
generasi = "generasi dewasa";        
    }
    else if (usia >= 37) {
generasi = "generasi tua";    
    }
    else {
generasi = "generasi bayi";
    }
    
    return biodata.innerHTML = generasi;
}

console.log (nama);
console.log (usia);
generateBiodata();
