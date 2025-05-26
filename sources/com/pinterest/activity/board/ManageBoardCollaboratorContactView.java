package com.pinterest.activity.board;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import d70.d;
import d70.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/activity/board/ManageBoardCollaboratorContactView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ManageBoardCollaboratorContactView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f34841a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f34842b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f34843c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f34844d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f34845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageBoardCollaboratorContactView(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(e.view_manage_board_collaborator_contact, (ViewGroup) this, true);
        View findViewById = findViewById(d.collaborator_contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f34841a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(d.collaborator_contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f34842b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(d.collaborator_contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f34843c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(d.collaborator_inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f34844d = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(d.collaborator_inline_added_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f34845e = (GestaltButton) findViewById5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageBoardCollaboratorContactView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(getContext()).inflate(e.view_manage_board_collaborator_contact, (ViewGroup) this, true);
        View findViewById = findViewById(d.collaborator_contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f34841a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(d.collaborator_contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f34842b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(d.collaborator_contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f34843c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(d.collaborator_inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f34844d = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(d.collaborator_inline_added_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f34845e = (GestaltButton) findViewById5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageBoardCollaboratorContactView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(getContext()).inflate(e.view_manage_board_collaborator_contact, (ViewGroup) this, true);
        View findViewById = findViewById(d.collaborator_contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f34841a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(d.collaborator_contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f34842b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(d.collaborator_contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f34843c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(d.collaborator_inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f34844d = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(d.collaborator_inline_added_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f34845e = (GestaltButton) findViewById5;
    }
}
