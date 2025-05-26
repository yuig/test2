package h0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.h0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.m0;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f66406a;

    /* renamed from: b, reason: collision with root package name */
    public int f66407b;

    /* renamed from: c, reason: collision with root package name */
    public Object f66408c;

    /* renamed from: d, reason: collision with root package name */
    public Object f66409d;

    /* renamed from: e, reason: collision with root package name */
    public Object f66410e;

    public i(int i13) {
        if (i13 != 3) {
            return;
        }
        this.f66408c = new t72.j((pk2.f) null);
    }

    public static ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(e0.b.f56693a);
        arrayList2.add(e0.b.f56695c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (e0.b.a(size, (Rational) it2.next(), k0.c.f77783c)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational e(int i13, boolean z13) {
        if (i13 != -1) {
            if (i13 == 0) {
                return z13 ? e0.b.f56693a : e0.b.f56694b;
            }
            if (i13 == 1) {
                return z13 ? e0.b.f56695c : e0.b.f56696d;
            }
            m0.s("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i13);
        }
        return null;
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = b(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (e0.b.a(size, rational, k0.c.f77783c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void g(List list, Size size) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        list.addAll(arrayList);
    }

    public final void a() {
        while (true) {
            Object obj = this.f66409d;
            if (((qe2.b) obj) == null) {
                this.f66410e = null;
                this.f66406a = 0;
                this.f66407b = 0;
                return;
            } else {
                qe2.b bVar = (qe2.b) obj;
                this.f66409d = bVar.f103635c;
                t72.j jVar = (t72.j) this.f66408c;
                bVar.f103635c = (qe2.b) jVar.f116663b;
                jVar.f116663b = bVar;
            }
        }
    }

    public final int c() {
        int i13 = this.f66407b;
        if (i13 == 2) {
            return 2048;
        }
        if (i13 != 3) {
            return 0;
        }
        return BitmapUtils.BITMAP_TO_JPEG_SIZE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        if (k0.c.a(r3) < (r5.getHeight() * r5.getWidth())) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList d(androidx.camera.core.impl.z2 r13) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.d(androidx.camera.core.impl.z2):java.util.ArrayList");
    }

    public i(h0 h0Var, Size size) {
        Rational rational;
        this.f66408c = h0Var;
        this.f66406a = h0Var.b();
        this.f66407b = ((h0) this.f66408c).d();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List h10 = ((h0) this.f66408c).h(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
            if (h10.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(h10, new e0.f(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f66409d = rational;
        this.f66410e = new j(h0Var, rational);
    }

    public i(int i13, String str, int i14, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f66406a = i13;
        this.f66408c = str;
        this.f66407b = i14;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f66409d = unmodifiableList;
        this.f66410e = bArr;
    }
}
