package z9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class b0 extends z implements Iterable, ll2.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f141159o = 0;

    /* renamed from: k, reason: collision with root package name */
    public final g1.p0 f141160k;

    /* renamed from: l, reason: collision with root package name */
    public int f141161l;

    /* renamed from: m, reason: collision with root package name */
    public String f141162m;

    /* renamed from: n, reason: collision with root package name */
    public String f141163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r0 navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f141160k = new g1.p0();
    }

    @Override // z9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        if (super.equals(obj)) {
            g1.p0 p0Var = this.f141160k;
            int k13 = p0Var.k();
            b0 b0Var = (b0) obj;
            g1.p0 p0Var2 = b0Var.f141160k;
            if (k13 == p0Var2.k() && this.f141161l == b0Var.f141161l) {
                Intrinsics.checkNotNullParameter(p0Var, "<this>");
                for (z zVar : yn2.x.c(new g1.s0(p0Var))) {
                    if (!Intrinsics.d(zVar, p0Var2.g(zVar.f141329h))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // z9.z
    public final y f(androidx.appcompat.app.d navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        y f13 = super.f(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(this);
        while (a0Var.hasNext()) {
            y f14 = ((z) a0Var.next()).f(navDeepLinkRequest);
            if (f14 != null) {
                arrayList.add(f14);
            }
        }
        y[] elements = {f13, (y) CollectionsKt.e0(arrayList)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (y) CollectionsKt.e0(kotlin.collections.c0.A(elements));
    }

    @Override // z9.z
    public final int hashCode() {
        int i13 = this.f141161l;
        g1.p0 p0Var = this.f141160k;
        int k13 = p0Var.k();
        for (int i14 = 0; i14 < k13; i14++) {
            i13 = (((i13 * 31) + p0Var.i(i14)) * 31) + ((z) p0Var.l(i14)).hashCode();
        }
        return i13;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a0(this);
    }

    @Override // z9.z
    public final void j(Context context, AttributeSet attrs) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.j(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, aa.a.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        v(obtainAttributes.getResourceId(aa.a.NavGraphNavigator_startDestination, 0));
        int i13 = this.f141161l;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i13 <= 16777215) {
            valueOf = String.valueOf(i13);
        } else {
            try {
                valueOf = context.getResources().getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i13);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
        }
        this.f141162m = valueOf;
        Unit unit = Unit.f80348a;
        obtainAttributes.recycle();
    }

    public final void r(z node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i13 = node.f141329h;
        String str = node.f141330i;
        if (i13 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (this.f141330i != null && !(!Intrinsics.d(str, r2))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i13 == this.f141329h) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        g1.p0 p0Var = this.f141160k;
        z zVar = (z) p0Var.g(i13);
        if (zVar == node) {
            return;
        }
        if (node.f141323b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (zVar != null) {
            zVar.f141323b = null;
        }
        node.f141323b = this;
        p0Var.j(node.f141329h, node);
    }

    public final z s(int i13, boolean z13) {
        b0 b0Var;
        z zVar = (z) this.f141160k.g(i13);
        if (zVar != null) {
            return zVar;
        }
        if (!z13 || (b0Var = this.f141323b) == null) {
            return null;
        }
        return b0Var.s(i13, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final z t(String route, boolean z13) {
        b0 b0Var;
        z zVar;
        Intrinsics.checkNotNullParameter(route, "route");
        int hashCode = (route != null ? "android-app://androidx.navigation/".concat(route) : "").hashCode();
        g1.p0 p0Var = this.f141160k;
        z zVar2 = (z) p0Var.g(hashCode);
        if (zVar2 == null) {
            Intrinsics.checkNotNullParameter(p0Var, "<this>");
            Iterator it = yn2.x.c(new g1.s0(p0Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    zVar = 0;
                    break;
                }
                zVar = it.next();
                if (((z) zVar).i(route) != null) {
                    break;
                }
            }
            zVar2 = zVar;
        }
        if (zVar2 != null) {
            return zVar2;
        }
        if (!z13 || (b0Var = this.f141323b) == null || route == null || kotlin.text.z.j(route)) {
            return null;
        }
        return b0Var.t(route, true);
    }

    @Override // z9.z
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        String str = this.f141163n;
        z t13 = (str == null || kotlin.text.z.j(str)) ? null : t(str, true);
        if (t13 == null) {
            t13 = s(this.f141161l, true);
        }
        sb3.append(" startDestination=");
        if (t13 == null) {
            String str2 = this.f141163n;
            if (str2 != null) {
                sb3.append(str2);
            } else {
                String str3 = this.f141162m;
                if (str3 != null) {
                    sb3.append(str3);
                } else {
                    sb3.append("0x" + Integer.toHexString(this.f141161l));
                }
            }
        } else {
            sb3.append("{");
            sb3.append(t13.toString());
            sb3.append("}");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }

    public final y u(androidx.appcompat.app.d request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return super.f(request);
    }

    public final void v(int i13) {
        if (i13 != this.f141329h) {
            if (this.f141163n != null) {
                w(null);
            }
            this.f141161l = i13;
            this.f141162m = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i13 + " cannot use the same id as the graph " + this).toString());
    }

    public final void w(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (!(!Intrinsics.d(str, this.f141330i))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!kotlin.text.z.j(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f141161l = hashCode;
        this.f141163n = str;
    }
}
