package cv0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f53258b;

    /* renamed from: c, reason: collision with root package name */
    public final av0.j f53259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, @NotNull av0.j onSaveCallback) {
        super(8, null);
        Intrinsics.checkNotNullParameter(onSaveCallback, "onSaveCallback");
        this.f53258b = str;
        this.f53259c = onSaveCallback;
    }

    public /* synthetic */ a(String str, av0.j jVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, jVar);
    }
}
