package com.pinterest.feature.board.create.collaboratorview.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import x60.c;
import x60.d;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/board/create/collaboratorview/view/BoardCreateCollaboratorView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateCollaboratorView extends LinearLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45151f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f45152a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45153b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45154c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButtonToggle f45155d;

    /* renamed from: e, reason: collision with root package name */
    public TypeAheadItem f45156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateCollaboratorView(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(d.view_vertical_contact, (ViewGroup) this, true);
        View findViewById = findViewById(c.contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45152a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(c.contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45153b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(c.contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45154c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(c.inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45155d = (GestaltButtonToggle) findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateCollaboratorView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(getContext()).inflate(d.view_vertical_contact, (ViewGroup) this, true);
        View findViewById = findViewById(c.contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45152a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(c.contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45153b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(c.contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45154c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(c.inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45155d = (GestaltButtonToggle) findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateCollaboratorView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(getContext()).inflate(d.view_vertical_contact, (ViewGroup) this, true);
        View findViewById = findViewById(c.contact_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45152a = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(c.contact_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45153b = a0.v((GestaltText) findViewById2);
        View findViewById3 = findViewById(c.contact_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45154c = a0.r((GestaltText) findViewById3);
        View findViewById4 = findViewById(c.inline_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45155d = (GestaltButtonToggle) findViewById4;
    }
}
