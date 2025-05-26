package ro2;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements oo2.g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f108988b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final String f108989c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qo2.c f108990a;

    public g() {
        r element = r.f109037a;
        Intrinsics.checkNotNullParameter(element, "elementSerializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f108990a = new qo2.c(element.a(), 1);
    }

    @Override // oo2.g
    public final boolean b() {
        this.f108990a.getClass();
        return false;
    }

    @Override // oo2.g
    public final oo2.n c() {
        this.f108990a.getClass();
        return oo2.o.f96904b;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f108990a.d(name);
    }

    @Override // oo2.g
    public final int e() {
        return this.f108990a.f104575b;
    }

    @Override // oo2.g
    public final String f(int i13) {
        this.f108990a.getClass();
        return String.valueOf(i13);
    }

    @Override // oo2.g
    public final List g(int i13) {
        return this.f108990a.g(i13);
    }

    @Override // oo2.g
    public final List getAnnotations() {
        this.f108990a.getClass();
        return q0.f80391a;
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        return this.f108990a.h(i13);
    }

    @Override // oo2.g
    public final String i() {
        return f108989c;
    }

    @Override // oo2.g
    public final boolean isInline() {
        this.f108990a.getClass();
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        this.f108990a.j(i13);
        return false;
    }
}
