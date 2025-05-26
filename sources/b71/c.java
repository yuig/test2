package b71;

import dl1.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f22089a;

    /* renamed from: b, reason: collision with root package name */
    public final b f22090b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f22091c;

    public c(@NotNull String query, @NotNull b headerType, @NotNull Function0<Boolean> isGridEmptyOfPins) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        Intrinsics.checkNotNullParameter(isGridEmptyOfPins, "isGridEmptyOfPins");
        this.f22089a = query;
        this.f22090b = headerType;
        this.f22091c = isGridEmptyOfPins;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return this.f22090b.name();
    }

    public /* synthetic */ c(String str, b bVar, Function0 function0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, (i13 & 4) != 0 ? a.f22088i : function0);
    }
}
