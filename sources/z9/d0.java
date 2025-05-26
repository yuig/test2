package z9;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz9/d0;", "Lz9/r0;", "Lz9/b0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@q0("navigation")
/* loaded from: classes3.dex */
public class d0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final s0 f141177c;

    public d0(s0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f141177c = navigatorProvider;
    }

    @Override // z9.r0
    public final void d(List entries, g0 g0Var) {
        String str;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            z zVar = kVar.f141211b;
            Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            b0 b0Var = (b0) zVar;
            Bundle a13 = kVar.a();
            int i13 = b0Var.f141161l;
            String str2 = b0Var.f141163n;
            if (i13 == 0 && str2 == null) {
                StringBuilder sb3 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i14 = b0Var.f141329h;
                if (i14 != 0) {
                    str = b0Var.f141324c;
                    if (str == null) {
                        str = String.valueOf(i14);
                    }
                } else {
                    str = "the root navigation";
                }
                sb3.append(str);
                throw new IllegalStateException(sb3.toString().toString());
            }
            z destination = str2 != null ? b0Var.t(str2, false) : b0Var.s(i13, false);
            if (destination == null) {
                if (b0Var.f141162m == null) {
                    String str3 = b0Var.f141163n;
                    if (str3 == null) {
                        str3 = String.valueOf(b0Var.f141161l);
                    }
                    b0Var.f141162m = str3;
                }
                String str4 = b0Var.f141162m;
                Intrinsics.f(str4);
                throw new IllegalArgumentException(a.a.k("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            r0 b13 = this.f141177c.b(destination.f141322a);
            l b14 = b();
            Bundle c13 = destination.c(a13);
            Intrinsics.checkNotNullParameter(destination, "destination");
            p pVar = b14.f141230h;
            b13.d(kotlin.collections.e0.b(g4.u.Y(pVar.f141254a, destination, c13, pVar.j(), pVar.f141269p)), g0Var);
        }
    }

    @Override // z9.r0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b0 a() {
        return new b0(this);
    }
}
