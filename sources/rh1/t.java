package rh1;

import android.view.View;
import com.pinterest.feature.unifiedcomments.view.CommentReactionEducationModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentReactionEducationModalView f108291b;

    public /* synthetic */ t(CommentReactionEducationModalView commentReactionEducationModalView, int i13) {
        this.f108290a = i13;
        this.f108291b = commentReactionEducationModalView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f108290a;
        CommentReactionEducationModalView commentReactionEducationModalView = this.f108291b;
        switch (i13) {
            case 0:
                CommentReactionEducationModalView.L(commentReactionEducationModalView);
                break;
            case 1:
                CommentReactionEducationModalView.T(commentReactionEducationModalView);
                break;
            case 2:
                CommentReactionEducationModalView.L(commentReactionEducationModalView);
                break;
            case 3:
                CommentReactionEducationModalView.T(commentReactionEducationModalView);
                break;
            case 4:
                CommentReactionEducationModalView.L(commentReactionEducationModalView);
                break;
            default:
                CommentReactionEducationModalView.T(commentReactionEducationModalView);
                break;
        }
    }
}
