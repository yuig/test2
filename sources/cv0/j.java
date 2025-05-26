package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j extends z {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f53272b;

    /* renamed from: c, reason: collision with root package name */
    public final float f53273c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53274d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53275e;

    /* renamed from: f, reason: collision with root package name */
    public final String f53276f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f53277g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f53278h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Integer num, int i13, float f13, String str, boolean z13, @NotNull String videoDuration, @NotNull Function0<Unit> onEditCoverTapped, Function0<Unit> function0) {
        super(i13, null);
        Intrinsics.checkNotNullParameter(videoDuration, "videoDuration");
        Intrinsics.checkNotNullParameter(onEditCoverTapped, "onEditCoverTapped");
        this.f53272b = num;
        this.f53273c = f13;
        this.f53274d = str;
        this.f53275e = z13;
        this.f53276f = videoDuration;
        this.f53277g = onEditCoverTapped;
        this.f53278h = function0;
    }

    public /* synthetic */ j(Integer num, int i13, float f13, String str, boolean z13, String str2, Function0 function0, Function0 function02, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? 9 : i13, f13, str, z13, str2, function0, function02);
    }
}
