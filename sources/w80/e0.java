package w80;

import android.view.View;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f128280b;

    public /* synthetic */ e0(int i13, Function1 function1) {
        this.f128279a = i13;
        this.f128280b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f128279a;
        Function1 onEvent = this.f128280b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(onEvent, "$onEvent");
                onEvent.invoke(s80.t0.f111798a);
                break;
            case 1:
                int i14 = hz0.d.f70643b;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 2:
                int i15 = CommentReactionIndicator.f45475g;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 3:
                int i16 = CommentReactionIndicator.f45475g;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 4:
                int i17 = CommentReactionIndicator.f45475g;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 5:
                int i18 = CommentReactionIndicator.f45475g;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 6:
                int i19 = lq0.o0.R1;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            case 7:
                int i23 = lq0.o0.R1;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
            default:
                int i24 = lq0.o0.R1;
                Intrinsics.checkNotNullParameter(onEvent, "$tmp0");
                onEvent.invoke(view);
                break;
        }
    }
}
