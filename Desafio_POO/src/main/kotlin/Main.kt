
enum class level {BASIC, INTERMIATE, MASTER};

data class student(val name:String , val email:String , val age:Int);

data class educationalContent(val name:String, val duration:Int = 60);

data class training(val name: String, val content: List<educationalContent>, val level:level){

    val registered = mutableListOf<student>();
    fun enroll(students: student){
        registered.add(students);
    }
    fun subscriberList(){
        for(user in registered){
            println(user.name);
        }
    }
    fun gridContent(){
        for(cont in content){
            println("${cont.name} - ${cont.duration}");
        }
    }
}
fun main(){
    //cursos individuais
    val moduleJava = educationalContent("Curso Java", 150);
    val moduleDocker = educationalContent("Curso Docker", 40);
    val moduleLinux = educationalContent("Curso linux", 40);

    val listContent = mutableListOf<educationalContent>();
    listContent.add(moduleJava);
    listContent.add(moduleDocker);
    listContent.add(moduleLinux);

    //formação completa com todos cursos
    val trainingFullStack = training("Formação FULLSTACK Developer", listContent, level.MASTER);

    //cria lista de usuário
    val scarlxrd = student("Scarlxrd", "scarlxrd2004@gmail.com", 18);
    val scar = student("Scar", "scar2004@gmail.com", 18);
    val funky = student("Funky", "funky2004@gmail.com", 18);

    //matriculando usuários em formações
    trainingFullStack.enroll(scarlxrd);
    trainingFullStack.enroll(scar);
    trainingFullStack.enroll(funky);

    println("========================================");
    println("Dados de formação");
    println("${trainingFullStack.name} - ${trainingFullStack.level}");
    println("Grade de formação");
    println(trainingFullStack.gridContent().toString());
    println("========================================");
    println("Lista de Inscritos");
    println(trainingFullStack.subscriberList().toString());
}