package e51;

import b41.c;
import dl1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f57478a;

    /* renamed from: b, reason: collision with root package name */
    public final c f57479b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57480c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57481d;

    public b() {
        this(null, null, false, 7, null);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String _uid = this.f57481d;
        Intrinsics.checkNotNullExpressionValue(_uid, "_uid");
        return _uid;
    }

    public b(@NotNull String message, c cVar, boolean z13) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f57478a = message;
        this.f57479b = cVar;
        this.f57480c = z13;
        this.f57481d = cp2.a.a(8);
    }

    public /* synthetic */ b(String str, c cVar, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? false : z13);
    }
}
