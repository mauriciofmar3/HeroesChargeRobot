javac *.java Models/*.java Views/*.java && 
mkdir -p bin &&
mv *.class bin && 
mv Models/*.class bin && 
mv Views/*.class bin && 
java -cp bin Robot