package rh1;

import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f108268b;

    public /* synthetic */ p1(v1 v1Var, int i13) {
        this.f108267a = i13;
        this.f108268b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f108267a;
        v1 this$0 = this.f108268b;
        switch (i13) {
            case 0:
                int i14 = v1.S0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                NewCommentTextEdit newCommentTextEdit = this$0.f108319v0;
                if (newCommentTextEdit != null) {
                    hf0.b.s(newCommentTextEdit);
                    return;
                } else {
                    Intrinsics.r("textEdit");
                    throw null;
                }
            default:
                int i15 = v1.S0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                NewCommentTextEdit newCommentTextEdit2 = this$0.f108319v0;
                if (newCommentTextEdit2 != null) {
                    hf0.b.s(newCommentTextEdit2);
                    return;
                } else {
                    Intrinsics.r("textEdit");
                    throw null;
                }
        }
    }
}
