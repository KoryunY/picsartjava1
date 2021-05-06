package Proj.Military.Arm.Defensive;

import Proj.Military.Resc.Rescue;

import java.util.List;
import java.util.Scanner;

public class DefenseService extends Defense {
    public Defense CreateDefense() {
        Defense d = new Defense();
        Scanner scanner = new Scanner(System.in);
        d.CreateRobot(scanner);

        return d;
    }

    public String DefenseToTxt(Defense defense) {
        return ArmedToTxt(defense) + defense.getDefenseType()
                + "," + (defense.isExtraArmor() ? "yes" : "No") + "," + defense.getOverHeatingTime() + "\n";

    }

    public Defense DefenseFromTxt(String line) {
        String[] split = line.split(",");
        int i = 0;
        Defense defense = new Defense();
        i = ArmedFromTxt(defense, split, i);
        defense.setDefenseType(split[i++]);
        defense.setExtraArmor(split[i++].charAt(0) == 'y');
        defense.setOverHeatingTime(Double.parseDouble(split[i++]));
        return defense;
    }

    public String RetDefTypeofMinOverheatTimeWhichHasExtraArmor(List<Defense> defenses) {
        Defense min = null;
        int j = 0;
        for (int i = 0; i < defenses.size(); i++) {
            if (defenses.get(i).isExtraArmor()) {
                min = defenses.get(i);
                j = i;
                break;
            }
        }
        for (; j < defenses.size(); j++) {
            if (defenses.get(j).isExtraArmor() && defenses.get(j).getOverHeatingTime() < min.getOverHeatingTime())
                min = defenses.get(j);
        }
        return min.getDefenseType();
    }
}
