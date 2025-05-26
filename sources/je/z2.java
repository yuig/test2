package je;

import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f75829a;

    static {
        HashMap hashMap = new HashMap(9);
        f75829a = hashMap;
        g2 g2Var = g2.pt;
        hashMap.put("xx-small", new m0(0.694f, g2Var));
        hashMap.put("x-small", new m0(0.833f, g2Var));
        hashMap.put("small", new m0(10.0f, g2Var));
        hashMap.put("medium", new m0(12.0f, g2Var));
        hashMap.put("large", new m0(14.4f, g2Var));
        hashMap.put("x-large", new m0(17.3f, g2Var));
        hashMap.put("xx-large", new m0(20.7f, g2Var));
        g2 g2Var2 = g2.percent;
        hashMap.put("smaller", new m0(83.33f, g2Var2));
        hashMap.put("larger", new m0(120.0f, g2Var2));
    }
}
