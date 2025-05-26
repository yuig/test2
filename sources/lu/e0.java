package lu;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f84881u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f84882v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f84883w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(View itemView, LinearLayout questionParent, GestaltText titleView, ArrayList quizQuestionViewList) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(questionParent, "questionParent");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(quizQuestionViewList, "quizQuestionViewList");
        this.f84881u = questionParent;
        this.f84882v = titleView;
        this.f84883w = quizQuestionViewList;
    }
}
