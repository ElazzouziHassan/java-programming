public class Robot {
  private String name;
  private int health;

  public Robot(String name) {
      this.name = name;
      this.health = 10;
  }

  public void fire(Robot target) {
      if (!isDead() && !target.isDead()) {
          target.takeDamage(2);
          System.out.println("Robot " + this.name + " a été touché par le Robot " + target.getName() + " !");
      }
  }

  private void takeDamage(int damage) {
      this.health = Math.max(0, this.health - damage);
  }

  public boolean isDead() {
      return this.health == 0;
  }

  public String getName() {
      return name;
  }

  @Override
  public String toString() {
      return "Robot " + name;
  }
}
