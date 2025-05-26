package rb2;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f107105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f107106c;

    public /* synthetic */ a(d dVar, String str, int i13) {
        this.f107104a = i13;
        this.f107105b = dVar;
        this.f107106c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f107104a;
        String boardId = this.f107106c;
        d this$0 = this.f107105b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                this$0.g(boardId);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                this$0.g(boardId);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                this$0.g(boardId);
                break;
        }
    }
}
