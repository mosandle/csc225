final class Event //reviewed and confirmed done
{

   private final Action action;
   private final long time;
   private final Entity entity;

   public Action getAction() {
      return action;
   }

   public long getTime() {
      return time;
   }

   public Entity getEntity() {
      return entity;
   }

   public Event(Action action, long time, Entity entity)
   {
      this.action = action;
      this.time = time;
      this.entity = entity;
   }
}//end of class
