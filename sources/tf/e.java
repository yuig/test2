package tf;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sf.n;

/* loaded from: classes3.dex */
public abstract class e implements xf.b {

    /* renamed from: a */
    public List f117512a;

    /* renamed from: b */
    public final ArrayList f117513b;

    /* renamed from: c */
    public String f117514c;

    /* renamed from: f */
    public transient f0.h f117517f;

    /* renamed from: o */
    public final List f117526o;

    /* renamed from: p */
    public float f117527p;

    /* renamed from: q */
    public float f117528q;

    /* renamed from: r */
    public float f117529r;

    /* renamed from: s */
    public float f117530s;

    /* renamed from: d */
    public final n f117515d = n.LEFT;

    /* renamed from: e */
    public final boolean f117516e = true;

    /* renamed from: g */
    public final sf.f f117518g = sf.f.DEFAULT;

    /* renamed from: h */
    public final float f117519h = Float.NaN;

    /* renamed from: i */
    public final float f117520i = Float.NaN;

    /* renamed from: j */
    public boolean f117521j = true;

    /* renamed from: k */
    public final boolean f117522k = true;

    /* renamed from: l */
    public final ag.d f117523l = new ag.d();

    /* renamed from: m */
    public final float f117524m = 17.0f;

    /* renamed from: n */
    public final boolean f117525n = true;

    public e(List list, String str) {
        this.f117512a = null;
        this.f117513b = null;
        this.f117514c = "DataSet";
        this.f117512a = new ArrayList();
        this.f117513b = new ArrayList();
        this.f117512a.add(Integer.valueOf(Color.rgb(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP, 255)));
        this.f117513b.add(-16777216);
        this.f117514c = str;
        this.f117527p = -3.4028235E38f;
        this.f117528q = Float.MAX_VALUE;
        this.f117529r = -3.4028235E38f;
        this.f117530s = Float.MAX_VALUE;
        this.f117526o = list;
        if (list == null) {
            this.f117526o = new ArrayList();
        }
        List list2 = this.f117526o;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.f117527p = -3.4028235E38f;
        this.f117528q = Float.MAX_VALUE;
        this.f117529r = -3.4028235E38f;
        this.f117530s = Float.MAX_VALUE;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a((Entry) it.next());
        }
    }

    public void a(Entry entry) {
        if (entry == null) {
            return;
        }
        if (entry.b() < this.f117530s) {
            this.f117530s = entry.b();
        }
        if (entry.b() > this.f117529r) {
            this.f117529r = entry.b();
        }
        b(entry);
    }

    public final void b(Entry entry) {
        if (entry.a() < this.f117528q) {
            this.f117528q = entry.a();
        }
        if (entry.a() > this.f117527p) {
            this.f117527p = entry.a();
        }
    }

    public final int c() {
        return ((Integer) this.f117512a.get(0)).intValue();
    }

    public final ArrayList d(float f13) {
        ArrayList arrayList = new ArrayList();
        List list = this.f117526o;
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                break;
            }
            int i14 = (size + i13) / 2;
            Entry entry = (Entry) list.get(i14);
            if (f13 == entry.b()) {
                while (i14 > 0 && ((Entry) list.get(i14 - 1)).b() == f13) {
                    i14--;
                }
                int size2 = list.size();
                while (i14 < size2) {
                    Entry entry2 = (Entry) list.get(i14);
                    if (entry2.b() != f13) {
                        break;
                    }
                    arrayList.add(entry2);
                    i14++;
                }
            } else if (f13 > entry.b()) {
                i13 = i14 + 1;
            } else {
                size = i14 - 1;
            }
        }
        return arrayList;
    }

    public final Entry e(int i13) {
        return (Entry) this.f117526o.get(i13);
    }

    public final Entry f(float f13, float f14, d dVar) {
        int g13 = g(f13, f14, dVar);
        if (g13 > -1) {
            return (Entry) this.f117526o.get(g13);
        }
        return null;
    }

    public final int g(float f13, float f14, d dVar) {
        int i13;
        Entry entry;
        List list = this.f117526o;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 < size) {
            int i15 = (i14 + size) / 2;
            float b13 = ((Entry) list.get(i15)).b() - f13;
            int i16 = i15 + 1;
            float b14 = ((Entry) list.get(i16)).b() - f13;
            float abs = Math.abs(b13);
            float abs2 = Math.abs(b14);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d2 = b13;
                    if (d2 < 0.0d) {
                        if (d2 < 0.0d) {
                        }
                    }
                }
                size = i15;
            }
            i14 = i16;
        }
        if (size == -1) {
            return size;
        }
        float b15 = ((Entry) list.get(size)).b();
        if (dVar == d.UP) {
            if (b15 < f13 && size < list.size() - 1) {
                size++;
            }
        } else if (dVar == d.DOWN && b15 > f13 && size > 0) {
            size--;
        }
        if (Float.isNaN(f14)) {
            return size;
        }
        while (size > 0 && ((Entry) list.get(size - 1)).b() == b15) {
            size--;
        }
        float a13 = ((Entry) list.get(size)).a();
        loop2: while (true) {
            i13 = size;
            do {
                size++;
                if (size >= list.size()) {
                    break loop2;
                }
                entry = (Entry) list.get(size);
                if (entry.b() != b15) {
                    break loop2;
                }
            } while (Math.abs(entry.a() - f14) >= Math.abs(a13 - f14));
            a13 = f14;
        }
        return i13;
    }

    public final int h(int i13) {
        ArrayList arrayList = this.f117513b;
        return ((Integer) arrayList.get(i13 % arrayList.size())).intValue();
    }

    public final void i(int i13) {
        if (this.f117512a == null) {
            this.f117512a = new ArrayList();
        }
        this.f117512a.clear();
        this.f117512a.add(Integer.valueOf(i13));
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb3 = new StringBuilder("DataSet, label: ");
        String str = this.f117514c;
        if (str == null) {
            str = "";
        }
        sb3.append(str);
        sb3.append(", entries: ");
        List list = this.f117526o;
        sb3.append(list.size());
        sb3.append("\n");
        stringBuffer2.append(sb3.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i13 = 0; i13 < list.size(); i13++) {
            stringBuffer.append(((Entry) list.get(i13)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
