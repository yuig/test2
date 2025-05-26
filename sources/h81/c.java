package h81;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.RectF;
import android.widget.RelativeLayout;
import com.pinterest.api.model.h2;
import h32.d4;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import s71.o;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class c extends RelativeLayout implements f81.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f68131a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68132b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f68133c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68134d;

    /* renamed from: e, reason: collision with root package name */
    public d f68135e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f68136f;

    /* renamed from: g, reason: collision with root package name */
    public final AnimatorSet f68137g;

    /* renamed from: h, reason: collision with root package name */
    public final v f68138h;

    /* renamed from: i, reason: collision with root package name */
    public f81.b f68139i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f68140j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f68141k;

    /* renamed from: l, reason: collision with root package name */
    public final d4 f68142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, float f13, float f14, Float f15, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68131a = f13;
        this.f68132b = f14;
        this.f68133c = f15;
        this.f68134d = i13;
        this.f68136f = new ArrayList();
        this.f68137g = new AnimatorSet();
        this.f68138h = m.b(new b(this, 0));
        this.f68140j = new ArrayList();
        this.f68141k = true;
        this.f68142l = d4.FLASHLIGHT;
    }

    public final void a(double d2, double d13, double d14, double d15, int i13, boolean z13) {
        h2 h2Var;
        Object obj;
        d dVar = (d) CollectionsKt.U(i13, this.f68140j);
        if (dVar != null) {
            Float f13 = this.f68133c;
            Float valueOf = f13 != null ? Float.valueOf(getY() - f13.floatValue()) : null;
            d dVar2 = this.f68135e;
            if (dVar2 != null) {
                dVar2.setVisibility(0);
            }
            f81.b bVar = this.f68139i;
            if (bVar != null) {
                float x13 = getX();
                float floatValue = valueOf != null ? valueOf.floatValue() : getY();
                g81.b bVar2 = (g81.b) bVar;
                float f14 = dVar.f68149g + x13;
                float f15 = this.f68134d;
                float max = Math.max(f14, f15);
                float max2 = Math.max(dVar.f68150h + floatValue, f15);
                float min = Math.min(dVar.f68151i + x13, bVar2.f64492c - f15);
                float min2 = Math.min(dVar.f68152j + floatValue, bVar2.f64493d - f15);
                boolean z14 = dVar.f68144b;
                if (z13) {
                    List list = bVar2.f64500k;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (lp2.b.l(d2, d13, d14, d15, (h2) obj)) {
                                    break;
                                }
                            }
                        }
                        h2Var = (h2) obj;
                    } else {
                        h2Var = null;
                    }
                    d0 pinalytics = bVar2.getPinalytics();
                    String o13 = h2Var != null ? h2Var.o() : null;
                    Integer valueOf2 = list != null ? Integer.valueOf(list.size()) : null;
                    Integer p13 = h2Var != null ? h2Var.p() : null;
                    if (pinalytics != null) {
                        pinalytics.Z(z14 ? u0.PIN_IMAGE_TAG : u0.SPOTLIGHT_DOT, o.d(bVar2.f64494e, bVar2.f64495f, bVar2.f64496g, bVar2.f64498i, o.f(d2, d13, d14, d15), bVar2.f64499j, o13, valueOf2, p13));
                    }
                }
                bVar2.f64491b.K1(new RectF(max, max2, min, min2), d2, d13, d14, d15, z14, z13, dVar.f68146d);
            }
            dVar.setVisibility(8);
            this.f68135e = dVar;
        }
    }

    public final void b() {
        d dVar = this.f68135e;
        if (dVar != null) {
            dVar.setVisibility(0);
        }
        d dVar2 = (d) CollectionsKt.U(0, this.f68140j);
        if (this.f68141k && dVar2 != null) {
            dVar2.setVisibility(8);
        }
        this.f68135e = dVar2;
    }

    public final void e(float f13, float f14) {
        setX(f13);
        Float f15 = this.f68133c;
        setY(f14 + (f15 != null ? f15.floatValue() : 0.0f));
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF94100s0() {
        return this.f68142l;
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
