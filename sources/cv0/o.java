package cv0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f53285b;

    /* renamed from: c, reason: collision with root package name */
    public final av0.h f53286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i13, String str, @NotNull av0.h saveTitleListener) {
        super(i13, null);
        Intrinsics.checkNotNullParameter(saveTitleListener, "saveTitleListener");
        this.f53285b = str;
        this.f53286c = saveTitleListener;
    }

    public /* synthetic */ o(int i13, String str, av0.h hVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 10 : i13, str, hVar);
    }
}
