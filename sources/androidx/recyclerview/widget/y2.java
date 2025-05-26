package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public abstract class y2 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f19716t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f19717a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f19718b;

    /* renamed from: j, reason: collision with root package name */
    public int f19726j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f19734r;

    /* renamed from: s, reason: collision with root package name */
    public b2 f19735s;

    /* renamed from: c, reason: collision with root package name */
    public int f19719c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f19720d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f19721e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f19722f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f19723g = -1;

    /* renamed from: h, reason: collision with root package name */
    public y2 f19724h = null;

    /* renamed from: i, reason: collision with root package name */
    public y2 f19725i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f19727k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f19728l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f19729m = 0;

    /* renamed from: n, reason: collision with root package name */
    public q2 f19730n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19731o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f19732p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f19733q = -1;

    public y2(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f19717a = view;
    }

    public final boolean D() {
        return this.f19730n != null;
    }

    public final boolean L() {
        return (this.f19726j & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0;
    }

    public final boolean T() {
        return (this.f19726j & 2) != 0;
    }

    public final void Y(int i13, boolean z13) {
        if (this.f19720d == -1) {
            this.f19720d = this.f19719c;
        }
        if (this.f19723g == -1) {
            this.f19723g = this.f19719c;
        }
        if (z13) {
            this.f19723g += i13;
        }
        this.f19719c += i13;
        View view = this.f19717a;
        if (view.getLayoutParams() != null) {
            ((RecyclerView.LayoutParams) view.getLayoutParams()).f19270c = true;
        }
    }

    public final void Z() {
        int[] iArr = RecyclerView.A0;
        this.f19726j = 0;
        this.f19719c = -1;
        this.f19720d = -1;
        this.f19721e = -1L;
        this.f19723g = -1;
        this.f19729m = 0;
        this.f19724h = null;
        this.f19725i = null;
        ArrayList arrayList = this.f19727k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f19726j &= -1025;
        this.f19732p = 0;
        this.f19733q = -1;
        RecyclerView.x(this);
    }

    public final void a0(boolean z13) {
        int i13 = this.f19729m;
        int i14 = z13 ? i13 - 1 : i13 + 1;
        this.f19729m = i14;
        if (i14 < 0) {
            this.f19729m = 0;
            int[] iArr = RecyclerView.A0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z13 && i14 == 1) {
            this.f19726j |= 16;
        } else if (z13 && i14 == 0) {
            this.f19726j &= -17;
        }
        int[] iArr2 = RecyclerView.A0;
    }

    public final void b(Object obj) {
        if (obj == null) {
            g(1024);
            return;
        }
        if ((1024 & this.f19726j) == 0) {
            if (this.f19727k == null) {
                ArrayList arrayList = new ArrayList();
                this.f19727k = arrayList;
                this.f19728l = Collections.unmodifiableList(arrayList);
            }
            this.f19727k.add(obj);
        }
    }

    public final boolean d0() {
        return (this.f19726j & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
    }

    public final void g(int i13) {
        this.f19726j = i13 | this.f19726j;
    }

    public final boolean g0() {
        return (this.f19726j & 32) != 0;
    }

    public final void i(int i13, int i14, boolean z13) {
        g(8);
        Y(i14, z13);
        this.f19719c = i13;
    }

    public final int j() {
        RecyclerView recyclerView = this.f19734r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.n1(this);
    }

    public final int k() {
        RecyclerView recyclerView;
        b2 b2Var;
        int n13;
        if (this.f19735s == null || (recyclerView = this.f19734r) == null || (b2Var = recyclerView.f19240m) == null || (n13 = recyclerView.n1(this)) == -1) {
            return -1;
        }
        return b2Var.d(this.f19735s, this, n13);
    }

    public final long l() {
        return this.f19721e;
    }

    public final int m() {
        int i13 = this.f19723g;
        return i13 == -1 ? this.f19719c : i13;
    }

    public final List n() {
        ArrayList arrayList;
        return ((this.f19726j & 1024) != 0 || (arrayList = this.f19727k) == null || arrayList.size() == 0) ? f19716t : this.f19728l;
    }

    public final boolean o(int i13) {
        return (i13 & this.f19726j) != 0;
    }

    public final boolean q() {
        View view = this.f19717a;
        return (view.getParent() == null || view.getParent() == this.f19734r) ? false : true;
    }

    public final boolean s() {
        return (this.f19726j & 1) != 0;
    }

    public final boolean t() {
        return (this.f19726j & 4) != 0;
    }

    public final String toString() {
        StringBuilder D = ep.b.D(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        D.append(Integer.toHexString(hashCode()));
        D.append(" position=");
        D.append(this.f19719c);
        D.append(" id=");
        D.append(this.f19721e);
        D.append(", oldPos=");
        D.append(this.f19720d);
        D.append(", pLpos:");
        D.append(this.f19723g);
        StringBuilder sb3 = new StringBuilder(D.toString());
        if (D()) {
            sb3.append(" scrap ");
            sb3.append(this.f19731o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (t()) {
            sb3.append(" invalid");
        }
        if (!s()) {
            sb3.append(" unbound");
        }
        if ((this.f19726j & 2) != 0) {
            sb3.append(" update");
        }
        if (z()) {
            sb3.append(" removed");
        }
        if (d0()) {
            sb3.append(" ignored");
        }
        if (L()) {
            sb3.append(" tmpDetached");
        }
        if (!x()) {
            sb3.append(" not recyclable(" + this.f19729m + ")");
        }
        if ((this.f19726j & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 || t()) {
            sb3.append(" undefined adapter position");
        }
        if (this.f19717a.getParent() == null) {
            sb3.append(" no parent");
        }
        sb3.append("}");
        return sb3.toString();
    }

    public final boolean x() {
        if ((this.f19726j & 16) == 0) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            if (!this.f19717a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return (this.f19726j & 8) != 0;
    }
}
