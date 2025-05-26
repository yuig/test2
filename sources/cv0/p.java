package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f53287b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53288c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53289d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53290e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f53291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull String title, @NotNull String imageUrl, @NotNull String userId, int i13, boolean z13, @NotNull Function0<Unit> onRemovePartnerTag) {
        super(4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(onRemovePartnerTag, "onRemovePartnerTag");
        this.f53287b = title;
        this.f53288c = imageUrl;
        this.f53289d = i13;
        this.f53290e = z13;
        this.f53291f = onRemovePartnerTag;
    }

    public /* synthetic */ p(String str, String str2, String str3, int i13, boolean z13, Function0 function0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i13, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? b.f53261k : function0);
    }
}
