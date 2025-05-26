package com.pinterest.feature.board.create.collaboratorview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bs1.c;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import x60.d;
import xk2.m;
import xk2.v;
import yj0.a;
import zj0.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/create/collaboratorview/view/BoardCreateAddCollaboratorsView;", "Landroid/widget/RelativeLayout;", "Lyj0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateAddCollaboratorsView extends RelativeLayout implements a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45145f = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f45146a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45147b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45148c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45149d;

    /* renamed from: e, reason: collision with root package name */
    public vs.b f45150e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardCreateAddCollaboratorsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        Object value = this.f45147b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        c.R1((RelativeLayout) value, false);
        Object value2 = this.f45148c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        c.R1((LinearLayout) value2, true);
        Object value3 = this.f45149d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        c.R1((PinterestRecyclerView) value3, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateAddCollaboratorsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(new ak0.b(this, 4));
        final int i14 = 0;
        v b14 = m.b(new ak0.b(this, 0));
        final int i15 = 1;
        v b15 = m.b(new ak0.b(this, 1));
        this.f45147b = m.b(new ak0.b(this, 2));
        this.f45148c = m.b(new ak0.b(this, 3));
        this.f45149d = m.b(new ak0.b(this, 5));
        View.inflate(context, d.view_board_create_add_collaborators, this);
        View findViewById = findViewById(x60.c.invite_tap_container_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.v((GestaltText) findViewById);
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltAvatarGroup) value).b(new gm1.a(this) { // from class: ak0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoardCreateAddCollaboratorsView f15459b;

            {
                this.f15459b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                zj0.b bVar;
                int i16 = i14;
                BoardCreateAddCollaboratorsView this$0 = this.f15459b;
                switch (i16) {
                    case 0:
                        int i17 = BoardCreateAddCollaboratorsView.f45145f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        zj0.b bVar2 = this$0.f45146a;
                        if (bVar2 != null) {
                            bVar2.p3();
                            break;
                        }
                        break;
                    default:
                        int i18 = BoardCreateAddCollaboratorsView.f45145f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (bVar = this$0.f45146a) != null) {
                            bVar.p3();
                            break;
                        }
                        break;
                }
            }
        });
        Object value2 = b14.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltIconButton) value2).u(new gm1.a(this) { // from class: ak0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoardCreateAddCollaboratorsView f15459b;

            {
                this.f15459b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                zj0.b bVar;
                int i16 = i15;
                BoardCreateAddCollaboratorsView this$0 = this.f15459b;
                switch (i16) {
                    case 0:
                        int i17 = BoardCreateAddCollaboratorsView.f45145f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        zj0.b bVar2 = this$0.f45146a;
                        if (bVar2 != null) {
                            bVar2.p3();
                            break;
                        }
                        break;
                    default:
                        int i18 = BoardCreateAddCollaboratorsView.f45145f;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (bVar = this$0.f45146a) != null) {
                            bVar.p3();
                            break;
                        }
                        break;
                }
            }
        });
        Object value3 = b15.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((LinearLayout) value3).setOnClickListener(new lj0.a(this, 4));
    }
}
