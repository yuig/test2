package com.pinterest.feature.user.board.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.user.group.view.GroupUserImageView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import th1.a;
import ub2.b;

@Deprecated
/* loaded from: classes5.dex */
public class MultiUserAvatarLayout extends FrameLayout implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48966d = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltAvatar f48967a;

    /* renamed from: b, reason: collision with root package name */
    public GroupUserImageView f48968b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f48969c;

    public MultiUserAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        View.inflate(getContext(), b.multi_user_avatar_mvp, this);
        this.f48967a = (GestaltAvatar) findViewById(ub2.a.user_avatar);
        this.f48968b = (GroupUserImageView) findViewById(ub2.a.collab_user_avatars_mvp);
        this.f48969c = (FrameLayout) findViewById(ub2.a.collab_user_avatars_layout);
    }

    public MultiUserAvatarLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
    }
}
