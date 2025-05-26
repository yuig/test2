package com.pinterest.feature.board.detail.collaboratorview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.feature.board.detail.collaboratorview.view.RevampBoardHeaderCollaboratorView;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import d70.g;
import gd0.c;
import java.util.ArrayList;
import java.util.List;
import kk0.a;
import kk0.b;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import mk0.e;
import nk0.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/detail/collaboratorview/view/RevampBoardHeaderCollaboratorView;", "Landroid/widget/FrameLayout;", "Lkk0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RevampBoardHeaderCollaboratorView extends FrameLayout implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45189c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatarGroup f45190a;

    /* renamed from: b, reason: collision with root package name */
    public a f45191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevampBoardHeaderCollaboratorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(6, context2, (AttributeSet) null);
        this.f45190a = gestaltAvatarGroup;
        final int i13 = 1;
        gestaltAvatarGroup.setImportantForAccessibility(1);
        gestaltAvatarGroup.setContentDescription(gestaltAvatarGroup.getResources().getString(g.board_collaborators_short));
        addView(gestaltAvatarGroup.a(d.f91097i).b(new gm1.a(this) { // from class: nk0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevampBoardHeaderCollaboratorView f91096b;

            {
                this.f91096b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                kk0.a aVar;
                kk0.a aVar2;
                int i14 = i13;
                RevampBoardHeaderCollaboratorView this$0 = this.f91096b;
                switch (i14) {
                    case 0:
                        int i15 = RevampBoardHeaderCollaboratorView.f45189c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.isEnabled() && (aVar = this$0.f45191b) != null) {
                            ((e) aVar).r3();
                            break;
                        }
                        break;
                    default:
                        int i16 = RevampBoardHeaderCollaboratorView.f45189c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.isEnabled() && (aVar2 = this$0.f45191b) != null) {
                            ((e) aVar2).r3();
                            break;
                        }
                        break;
                }
            }
        }));
    }

    @Override // kk0.b
    public final void I(lk0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        List<lk0.a> list = model.f83642b;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (lk0.a aVar : list) {
            arrayList.add(new sl1.e(aVar.f83638c, aVar.f83636a, aVar.f83639d, aVar.f83640e));
        }
        this.f45190a.a(new c(29, arrayList, model));
    }

    @Override // kk0.b
    public final void W4(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45191b = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevampBoardHeaderCollaboratorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(6, context2, (AttributeSet) null);
        this.f45190a = gestaltAvatarGroup;
        gestaltAvatarGroup.setImportantForAccessibility(1);
        gestaltAvatarGroup.setContentDescription(gestaltAvatarGroup.getResources().getString(g.board_collaborators_short));
        final int i14 = 0;
        addView(gestaltAvatarGroup.a(d.f91097i).b(new gm1.a(this) { // from class: nk0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevampBoardHeaderCollaboratorView f91096b;

            {
                this.f91096b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                kk0.a aVar;
                kk0.a aVar2;
                int i142 = i14;
                RevampBoardHeaderCollaboratorView this$0 = this.f91096b;
                switch (i142) {
                    case 0:
                        int i15 = RevampBoardHeaderCollaboratorView.f45189c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.isEnabled() && (aVar = this$0.f45191b) != null) {
                            ((e) aVar).r3();
                            break;
                        }
                        break;
                    default:
                        int i16 = RevampBoardHeaderCollaboratorView.f45189c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this$0.isEnabled() && (aVar2 = this$0.f45191b) != null) {
                            ((e) aVar2).r3();
                            break;
                        }
                        break;
                }
            }
        }));
    }
}
