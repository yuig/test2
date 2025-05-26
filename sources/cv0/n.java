package cv0;

import com.pinterest.api.model.ts0;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n extends z {

    /* renamed from: b, reason: collision with root package name */
    public final String f53282b;

    /* renamed from: c, reason: collision with root package name */
    public final List f53283c;

    /* renamed from: d, reason: collision with root package name */
    public final av0.h f53284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i13, String str, @NotNull List<? extends ts0> userMentionTags, @NotNull av0.h saveListener) {
        super(i13, null);
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        Intrinsics.checkNotNullParameter(saveListener, "saveListener");
        this.f53282b = str;
        this.f53283c = userMentionTags;
        this.f53284d = saveListener;
    }

    public n(int i13, String str, List list, av0.h hVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? q0.f80391a : list, hVar);
    }
}
