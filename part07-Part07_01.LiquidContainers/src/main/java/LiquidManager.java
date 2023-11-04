public class LiquidManager {
    int liquid;

    public LiquidManager() {
        this.liquid = 0;
    }

    public int getLiquid() {
        return liquid;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    public void AddLiquid(int amount) {
        if (this.liquid + amount >= 100) {
            this.liquid = 100;
        } else {
            this.liquid += amount;
        }
    }

    public void MoveLiquid(LiquidManager liquidManager, int amount) {
        int otherLiquid = liquidManager.getLiquid();
        if (this.liquid - amount <= 0) {
            if (otherLiquid + this.liquid >= 100) {
                liquidManager.setLiquid(100);
            } else {
                liquidManager.setLiquid(otherLiquid + this.liquid);
            }
            this.liquid = 0;
        } else {
            if (otherLiquid + amount > 100) {
                liquidManager.setLiquid(100);
            } else {
                liquidManager.setLiquid(otherLiquid + amount);
            }
            this.liquid -= amount;
        }
    }

    public void removeLiquid(int amount) {
        if (this.liquid - amount <= 0) {
            this.liquid = 0;
        } else {
            this.liquid -= amount;
        }
    }
}
