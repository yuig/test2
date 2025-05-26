package x92;

import com.pinterest.api.model.wx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d extends wx {

    /* renamed from: a, reason: collision with root package name */
    public final long f134370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134371b;

    /* renamed from: c, reason: collision with root package name */
    public final float f134372c;

    public d(long j13, @NotNull String suggestion, float f13) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        this.f134370a = j13;
        this.f134371b = suggestion;
        this.f134372c = f13;
    }

    public final long a() {
        return this.f134370a;
    }

    @Override // dl1.s
    public final String b() {
        return null;
    }

    public final float e() {
        return this.f134372c;
    }

    public final String g() {
        return this.f134371b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String suggestion, float f13) {
        this(0L, suggestion, f13);
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
    }
}
