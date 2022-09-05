object CaesarCipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val Encrypt = (c: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.indexOf(c.toUpper) + key) % alphabet.size);

  val Decrypt = (c: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.length + (alphabet.indexOf(c.toUpper) - key)) % alphabet.size);

  val cipher =
    (algo: (Char, Int, String) => Char, string: String, key: Int, alphabet: String) =>
      string.map(algo(_, key, alphabet));

  var key = 3;

  println(cipher(Encrypt, "CAESARCIPHER", key, alphabet));

  println(cipher(Decrypt, "KHOORZRUOG", key, alphabet));
}