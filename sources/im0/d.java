package im0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import gi.m;
import h32.a4;
import h32.d4;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pe.i;
import vb0.j;
import x02.x0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lim0/d;", "Lyk1/k;", "Lgm0/a;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f implements gm0.a {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f72605u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f72606j0;

    /* renamed from: k0, reason: collision with root package name */
    public x0 f72607k0;

    /* renamed from: l0, reason: collision with root package name */
    public m f72608l0;

    /* renamed from: m0, reason: collision with root package name */
    public k f72609m0;

    /* renamed from: n0, reason: collision with root package name */
    public BoardPermissionSettingCell f72610n0;

    /* renamed from: o0, reason: collision with root package name */
    public BoardPermissionSettingCell f72611o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltSwitchWithLabel f72612p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltSwitchWithLabel f72613q0;

    /* renamed from: r0, reason: collision with root package name */
    public hm0.c f72614r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f72615s0;

    /* renamed from: t0, reason: collision with root package name */
    public final a4 f72616t0;

    public d() {
        this.E = i70.b.fragment_board_permission_settings;
        this.f72615s0 = d4.BOARD;
        this.f72616t0 = a4.BOARD_PERMISSION_SETTINGS;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String b83 = b8();
        x0 x0Var = this.f72607k0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        m mVar = this.f72608l0;
        if (mVar == null) {
            Intrinsics.r("boardInviteUtils");
            throw null;
        }
        k kVar = this.f72609m0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        uk1.e eVar = this.f72606j0;
        if (eVar != null) {
            return new hm0.c(b83, x0Var, mVar, kVar, aVar, ((uk1.a) eVar).d(b8()), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final String b8() {
        Navigation navigation = this.I;
        j.f125466a.N(navigation != null ? navigation.getF49940b() : null, "Board id not set as navigation id for board permission settings fragment", new Object[0]);
        Navigation navigation2 = this.I;
        String f49940b = navigation2 != null ? navigation2.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getR0() {
        return this.f72616t0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.f72615s0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(i70.a.board_permission_setting_save_and_comment);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f72610n0 = (BoardPermissionSettingCell) findViewById;
        View findViewById2 = onCreateView.findViewById(i70.a.board_permission_setting_do_everything);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f72611o0 = (BoardPermissionSettingCell) findViewById2;
        View findViewById3 = onCreateView.findViewById(i70.a.invite_other_people_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f72612p0 = (GestaltSwitchWithLabel) findViewById3;
        View findViewById4 = onCreateView.findViewById(i70.a.edit_request_to_join_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f72613q0 = (GestaltSwitchWithLabel) findViewById4;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        BoardPermissionSettingCell boardPermissionSettingCell = this.f72610n0;
        if (boardPermissionSettingCell == null) {
            Intrinsics.r("saveAndCommentSettingCell");
            throw null;
        }
        com.pinterest.feature.board.permissions.d dVar = com.pinterest.feature.board.permissions.d.SAVE_AND_COMMENT;
        boardPermissionSettingCell.a(dVar.getPermissionTitleResId(), dVar.getPermissionSubtitleResId());
        final int i13 = 1;
        boardPermissionSettingCell.setOnClickListener(new View.OnClickListener(this) { // from class: im0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f72599b;

            {
                this.f72599b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                d this$0 = this.f72599b;
                switch (i14) {
                    case 0:
                        int i15 = d.f72605u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hm0.c cVar = this$0.f72614r0;
                        if (cVar != null) {
                            cVar.q3(y22.f.ALL);
                            return;
                        } else {
                            Intrinsics.r("permissionsSettingListener");
                            throw null;
                        }
                    default:
                        int i16 = d.f72605u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hm0.c cVar2 = this$0.f72614r0;
                        if (cVar2 != null) {
                            cVar2.q3(y22.f.SAVE_ONLY);
                            return;
                        } else {
                            Intrinsics.r("permissionsSettingListener");
                            throw null;
                        }
                }
            }
        });
        BoardPermissionSettingCell boardPermissionSettingCell2 = this.f72611o0;
        if (boardPermissionSettingCell2 == null) {
            Intrinsics.r("doEverythingSettingCell");
            throw null;
        }
        com.pinterest.feature.board.permissions.d dVar2 = com.pinterest.feature.board.permissions.d.DO_EVERYTHING;
        boardPermissionSettingCell2.a(dVar2.getPermissionTitleResId(), dVar2.getPermissionSubtitleResId());
        final int i14 = 0;
        boardPermissionSettingCell2.setOnClickListener(new View.OnClickListener(this) { // from class: im0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f72599b;

            {
                this.f72599b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                d this$0 = this.f72599b;
                switch (i142) {
                    case 0:
                        int i15 = d.f72605u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hm0.c cVar = this$0.f72614r0;
                        if (cVar != null) {
                            cVar.q3(y22.f.ALL);
                            return;
                        } else {
                            Intrinsics.r("permissionsSettingListener");
                            throw null;
                        }
                    default:
                        int i16 = d.f72605u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hm0.c cVar2 = this$0.f72614r0;
                        if (cVar2 != null) {
                            cVar2.q3(y22.f.SAVE_ONLY);
                            return;
                        } else {
                            Intrinsics.r("permissionsSettingListener");
                            throw null;
                        }
                }
            }
        });
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f72612p0;
        if (gestaltSwitchWithLabel == null) {
            Intrinsics.r("collaboratorsCanInviteOthersSwitch");
            throw null;
        }
        i.j(gestaltSwitchWithLabel, new c(this, i14));
        GestaltSwitchWithLabel gestaltSwitchWithLabel2 = this.f72613q0;
        if (gestaltSwitchWithLabel2 == null) {
            Intrinsics.r("peopleCanRequestToJoinSwitch");
            throw null;
        }
        i.j(gestaltSwitchWithLabel2, new c(this, i13));
        fo1.a i73 = i7();
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).Y(j70.c.board_permissions_collaborators_can);
        }
        fo1.a i74 = i7();
        if (i74 != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ((GestaltToolbarImpl) i74).c(new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(b.f72601k).e(new yb0.b(this, 23)));
        }
    }
}
