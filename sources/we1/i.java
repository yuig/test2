package we1;

import android.view.View;
import com.pinterest.api.model.dk0;
import com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews.BoardMoreIdeasUpsellCardView;
import com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews.BoardMoreIdeasUpsellListItemView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f129412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f129413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f129414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f129415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk0 f129416f;

    public /* synthetic */ i(k kVar, String str, String str2, j jVar, dk0 dk0Var, int i13) {
        this.f129411a = i13;
        this.f129412b = kVar;
        this.f129413c = str;
        this.f129414d = str2;
        this.f129415e = jVar;
        this.f129416f = dk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f129411a;
        j loggingSpec = this.f129415e;
        k onTapListener = this.f129412b;
        switch (i13) {
            case 0:
                int i14 = BoardMoreIdeasUpsellCardView.f48503i;
                Intrinsics.checkNotNullParameter(onTapListener, "$onTapListener");
                String boardId = this.f129413c;
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                String boardName = this.f129414d;
                Intrinsics.checkNotNullParameter(boardName, "$boardName");
                Intrinsics.checkNotNullParameter(loggingSpec, "$loggingSpec");
                ((xe1.y) onTapListener).a(boardId, boardName, loggingSpec.f129433a, loggingSpec.f129436d, loggingSpec.f129434b, this.f129416f);
                break;
            default:
                int i15 = BoardMoreIdeasUpsellListItemView.f48512f;
                Intrinsics.checkNotNullParameter(onTapListener, "$onTapListener");
                String boardId2 = this.f129413c;
                Intrinsics.checkNotNullParameter(boardId2, "$boardId");
                String boardName2 = this.f129414d;
                Intrinsics.checkNotNullParameter(boardName2, "$boardName");
                Intrinsics.checkNotNullParameter(loggingSpec, "$loggingSpec");
                ((xe1.y) onTapListener).a(boardId2, boardName2, loggingSpec.f129433a, loggingSpec.f129436d, loggingSpec.f129434b, this.f129416f);
                break;
        }
    }
}
