package v9;

import android.util.SparseArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import q8.k0;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f124703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124705c;

    /* renamed from: f, reason: collision with root package name */
    public final a7.m f124708f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f124709g;

    /* renamed from: h, reason: collision with root package name */
    public int f124710h;

    /* renamed from: i, reason: collision with root package name */
    public int f124711i;

    /* renamed from: j, reason: collision with root package name */
    public long f124712j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124713k;

    /* renamed from: l, reason: collision with root package name */
    public long f124714l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f124717o;

    /* renamed from: p, reason: collision with root package name */
    public long f124718p;

    /* renamed from: q, reason: collision with root package name */
    public long f124719q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f124720r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f124721s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f124706d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f124707e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public o f124715m = new o();

    /* renamed from: n, reason: collision with root package name */
    public o f124716n = new o();

    public p(k0 k0Var, boolean z13, boolean z14) {
        this.f124703a = k0Var;
        this.f124704b = z13;
        this.f124705c = z14;
        byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        this.f124709g = bArr;
        this.f124708f = new a7.m(bArr, 0, 0);
        this.f124713k = false;
        this.f124717o = false;
        o oVar = this.f124716n;
        oVar.f124688b = false;
        oVar.f124687a = false;
    }
}
