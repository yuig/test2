package ej0;

import android.content.Context;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function1 {

    /* renamed from: h, reason: collision with root package name */
    public static final d f59087h = new d(1, kotlin.jvm.internal.e.NO_RECEIVER, BoardHeaderImageView.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p03 = (Context) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new BoardHeaderImageView(0, 14, p03, null);
    }
}
