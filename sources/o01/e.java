package o01;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f92752a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f92753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull String lastSelectedOptionValue, Integer num) {
        super(null);
        Intrinsics.checkNotNullParameter(lastSelectedOptionValue, "lastSelectedOptionValue");
        this.f92752a = lastSelectedOptionValue;
        this.f92753b = num;
    }

    public /* synthetic */ e(String str, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : num);
    }
}
