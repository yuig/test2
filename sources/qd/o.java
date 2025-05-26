package qd;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class o implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f103565d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f103566e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f103567f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f103568g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f103569h;

    /* renamed from: a, reason: collision with root package name */
    public final dc.a f103570a = new dc.a(1);

    /* renamed from: b, reason: collision with root package name */
    public final tb.l f103571b = new tb.l(6);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f103572c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f103565d = configArr;
        f103566e = configArr;
        f103567f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f103568g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f103569h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i13, Bitmap.Config config) {
        return "[" + i13 + "](" + config + ")";
    }

    @Override // qd.k
    public final String B(int i13, int i14, Bitmap.Config config) {
        return c(he.n.d(config) * i13 * i14, config);
    }

    @Override // qd.k
    public final int D(Bitmap bitmap) {
        return he.n.c(bitmap);
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + u(bitmap) + ", this: " + this);
    }

    @Override // qd.k
    public final void b(Bitmap bitmap) {
        int c13 = he.n.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        dc.a aVar = this.f103570a;
        l lVar = (l) ((Queue) aVar.f92902b).poll();
        if (lVar == null) {
            lVar = aVar.k();
        }
        n nVar = (n) lVar;
        nVar.f103563b = c13;
        nVar.f103564c = config;
        this.f103571b.z(nVar, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(nVar.f103563b));
        d2.put(Integer.valueOf(nVar.f103563b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f103572c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    @Override // qd.k
    public final Bitmap g(int i13, int i14, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d2 = he.n.d(config) * i13 * i14;
        dc.a aVar = this.f103570a;
        l lVar = (l) ((Queue) aVar.f92902b).poll();
        if (lVar == null) {
            lVar = aVar.k();
        }
        n nVar = (n) lVar;
        nVar.f103563b = d2;
        nVar.f103564c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f103566e;
        } else {
            int i15 = m.f103561a[config.ordinal()];
            configArr = i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? new Bitmap.Config[]{config} : f103569h : f103568g : f103567f : f103565d;
        }
        int length = configArr.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i16];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(d2));
            if (num == null || num.intValue() > d2 * 8) {
                i16++;
            } else if (num.intValue() != d2 || (config2 != null ? !config2.equals(config) : config != null)) {
                aVar.g(nVar);
                int intValue = num.intValue();
                l lVar2 = (l) ((Queue) aVar.f92902b).poll();
                if (lVar2 == null) {
                    lVar2 = aVar.k();
                }
                nVar = (n) lVar2;
                nVar.f103563b = intValue;
                nVar.f103564c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f103571b.u(nVar);
        if (bitmap != null) {
            a(Integer.valueOf(nVar.f103563b), bitmap);
            bitmap.reconfigure(i13, i14, config);
        }
        return bitmap;
    }

    @Override // qd.k
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f103571b.B();
        if (bitmap != null) {
            a(Integer.valueOf(he.n.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder i13 = n60.o.i("SizeConfigStrategy{groupedMap=");
        i13.append(this.f103571b);
        i13.append(", sortedSizes=(");
        HashMap hashMap = this.f103572c;
        for (Map.Entry entry : hashMap.entrySet()) {
            i13.append(entry.getKey());
            i13.append('[');
            i13.append(entry.getValue());
            i13.append("], ");
        }
        if (!hashMap.isEmpty()) {
            i13.replace(i13.length() - 2, i13.length(), "");
        }
        i13.append(")}");
        return i13.toString();
    }

    @Override // qd.k
    public final String u(Bitmap bitmap) {
        return c(he.n.c(bitmap), bitmap.getConfig());
    }
}
