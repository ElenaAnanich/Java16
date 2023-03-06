public class NotRegisteredException extends RuntimeException{
    public NotRegisteredException(String playerName){
        super("Игрокс именем"+ playerName + "не найден");
    }
}
