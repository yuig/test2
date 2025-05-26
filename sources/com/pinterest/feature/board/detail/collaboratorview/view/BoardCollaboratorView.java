package com.pinterest.feature.board.detail.collaboratorview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bs1.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import d70.g;
import kk0.a;
import kk0.b;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import org.jetbrains.annotations.NotNull;
import sl1.i;
import sv.y;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/detail/collaboratorview/view/BoardCollaboratorView;", "Landroid/widget/FrameLayout;", "Lkk0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCollaboratorView extends FrameLayout implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45186c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatarGroup f45187a;

    /* renamed from: b, reason: collision with root package name */
    public a f45188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCollaboratorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltAvatarGroup a13 = a();
        a13.setImportantForAccessibility(2);
        this.f45187a = a13;
        setContentDescription(c.f2(this, g.accessibility_view_collaborators_button));
    }

    @Override // kk0.b
    public final void I(lk0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        y yVar = new y(model.f83642b, model, this, 23);
        GestaltAvatarGroup gestaltAvatarGroup = this.f45187a;
        gestaltAvatarGroup.a(yVar);
        c.U1(gestaltAvatarGroup);
    }

    @Override // kk0.b
    public final void W4(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45188b = listener;
        this.f45187a.setOnClickListener(new lj0.a(this, 6));
    }

    public final GestaltAvatarGroup a() {
        i iVar = new i(q0.f80391a, 0, null, true, t0.board_collaborator_facepile, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(context, iVar);
        gestaltAvatarGroup.setId(t0.board_collaborator_facepile);
        gestaltAvatarGroup.setVisibility(4);
        gestaltAvatarGroup.b(new yb0.b(this, 19));
        addView(gestaltAvatarGroup);
        return gestaltAvatarGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCollaboratorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltAvatarGroup a13 = a();
        a13.setImportantForAccessibility(2);
        this.f45187a = a13;
        setContentDescription(c.f2(this, g.accessibility_view_collaborators_button));
    }
}
