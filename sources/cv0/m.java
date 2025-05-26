package cv0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f53280b;

    /* renamed from: c, reason: collision with root package name */
    public final av0.e f53281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, @NotNull av0.e linkCallback) {
        super(5, null);
        Intrinsics.checkNotNullParameter(linkCallback, "linkCallback");
        this.f53280b = str;
        this.f53281c = linkCallback;
    }
}
