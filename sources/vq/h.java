package vq;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.d4;
import h32.f1;
import h32.i0;
import kh2.k3;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.j0;
import pk.a0;
import u50.f0;

/* loaded from: classes3.dex */
public final class h extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f126417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126418b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126419c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f126420d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f126421e;

    /* renamed from: f, reason: collision with root package name */
    public final p12.b f126422f;

    /* renamed from: g, reason: collision with root package name */
    public final no1.d f126423g;

    /* renamed from: h, reason: collision with root package name */
    public ModalViewWrapper f126424h;

    public h(wy0 userToReportOrBlock, String contactRequestId, String conversationId, j0 pinalytics, p12.b contactRequestService, no1.d contactRequestRemoteDataSource) {
        Intrinsics.checkNotNullParameter(userToReportOrBlock, "userToReportOrBlock");
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(contactRequestService, "contactRequestService");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        this.f126417a = userToReportOrBlock;
        this.f126418b = contactRequestId;
        this.f126419c = conversationId;
        this.f126420d = false;
        this.f126421e = pinalytics;
        this.f126422f = contactRequestService;
        this.f126423g = contactRequestRemoteDataSource;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 0;
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context, false);
        this.f126424h = modalViewWrapper;
        int i14 = wq.d.f130774p;
        Intrinsics.checkNotNullParameter(context, "context");
        wy0 userToReport = this.f126417a;
        Intrinsics.checkNotNullParameter(userToReport, "userToReport");
        String contactRequestId = this.f126418b;
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        String conversationId = this.f126419c;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        d0 pinalytics = this.f126421e;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        p12.b contactRequestService = this.f126422f;
        Intrinsics.checkNotNullParameter(contactRequestService, "contactRequestService");
        no1.d contactRequestRemoteDataSource = this.f126423g;
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        final wq.d dVar = new wq.d(context);
        View.inflate(dVar.getContext(), p60.c.report_block_contact_request_modal, dVar);
        dVar.f130775a = userToReport;
        dVar.f130776b = contactRequestId;
        dVar.f130777c = conversationId;
        dVar.f130778d = this.f126420d;
        dVar.f130788n = contactRequestRemoteDataSource;
        dVar.f130779e = -1;
        dVar.f130781g = pinalytics;
        dVar.f130782h = contactRequestService;
        dVar.f130783i = (LinearLayout) dVar.findViewById(p60.b.report_radio_button_container);
        dVar.f130784j = (GestaltText) dVar.findViewById(p60.b.block_user_title);
        dVar.f130785k = (GestaltText) dVar.findViewById(p60.b.block_user_text);
        dVar.f130786l = (Switch) dVar.findViewById(p60.b.block_user_switch);
        dVar.f130787m = (GestaltButton) dVar.findViewById(p60.b.report_user_button);
        Resources resources = dVar.getResources();
        int i15 = p60.d.block_user_from_report_title;
        final int i16 = 1;
        Object[] objArr = new Object[1];
        wy0 wy0Var = dVar.f130775a;
        if (wy0Var == null) {
            Intrinsics.r("userToReport");
            throw null;
        }
        objArr[0] = wy0Var.U2();
        String string = resources.getString(i15, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Resources resources2 = dVar.getResources();
        int i17 = p60.d.block_user_from_contact_request;
        final int i18 = 2;
        Object[] objArr2 = new Object[2];
        wy0 wy0Var2 = dVar.f130775a;
        if (wy0Var2 == null) {
            Intrinsics.r("userToReport");
            throw null;
        }
        objArr2[0] = wy0Var2.U2();
        wy0 wy0Var3 = dVar.f130775a;
        if (wy0Var3 == null) {
            Intrinsics.r("userToReport");
            throw null;
        }
        objArr2[1] = wy0Var3.z4();
        CharSequence string2 = j1.a0(resources2.getString(i17, objArr2));
        GestaltText gestaltText = dVar.f130784j;
        if (gestaltText != null) {
            a0.p(gestaltText, string);
        }
        GestaltText gestaltText2 = dVar.f130785k;
        if (gestaltText2 != null) {
            Intrinsics.f(string2);
            Intrinsics.checkNotNullParameter(string2, "string");
            a0.q(gestaltText2, new f0(string2));
        }
        LinearLayout linearLayout = dVar.f130783i;
        if (linearLayout != null && (findViewById8 = linearLayout.findViewById(p60.b.report_radio_button_spam_container)) != null) {
            findViewById8.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i19 = i13;
                    d this$0 = dVar;
                    switch (i19) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i23 = this$0.f130779e;
                            if (i23 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i23 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i23 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i23 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout2 = dVar.f130783i;
        if (linearLayout2 != null && (findViewById7 = linearLayout2.findViewById(p60.b.report_radio_button_spam)) != null) {
            findViewById7.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i19 = i16;
                    d this$0 = dVar;
                    switch (i19) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i23 = this$0.f130779e;
                            if (i23 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i23 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i23 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i23 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout3 = dVar.f130783i;
        if (linearLayout3 != null && (findViewById6 = linearLayout3.findViewById(p60.b.report_radio_button_unknown_sender_container)) != null) {
            findViewById6.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i19 = i18;
                    d this$0 = dVar;
                    switch (i19) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i23 = this$0.f130779e;
                            if (i23 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i23 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i23 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i23 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout4 = dVar.f130783i;
        if (linearLayout4 != null && (findViewById5 = linearLayout4.findViewById(p60.b.report_radio_button_unknown_sender)) != null) {
            final int i19 = 3;
            findViewById5.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i19;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i23 = this$0.f130779e;
                            if (i23 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i23 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i23 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i23 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout5 = dVar.f130783i;
        if (linearLayout5 != null && (findViewById4 = linearLayout5.findViewById(p60.b.report_radio_button_harassment_container)) != null) {
            final int i23 = 4;
            findViewById4.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i23;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i232 = this$0.f130779e;
                            if (i232 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i232 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i232 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i232 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout6 = dVar.f130783i;
        if (linearLayout6 != null && (findViewById3 = linearLayout6.findViewById(p60.b.report_radio_button_harassment)) != null) {
            final int i24 = 5;
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i24;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i232 = this$0.f130779e;
                            if (i232 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i232 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i232 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i232 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout7 = dVar.f130783i;
        if (linearLayout7 != null && (findViewById2 = linearLayout7.findViewById(p60.b.report_radio_button_self_harm_container)) != null) {
            final int i25 = 6;
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i25;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i232 = this$0.f130779e;
                            if (i232 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i232 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i232 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i232 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout8 = dVar.f130783i;
        if (linearLayout8 != null && (findViewById = linearLayout8.findViewById(p60.b.report_radio_button_self_harm)) != null) {
            final int i26 = 7;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i26;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i232 = this$0.f130779e;
                            if (i232 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i232 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i232 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i232 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        GestaltButton gestaltButton = dVar.f130787m;
        if (gestaltButton != null) {
            final int i27 = 8;
            gestaltButton.g(new View.OnClickListener() { // from class: wq.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 d0Var;
                    int i192 = i27;
                    d this$0 = dVar;
                    switch (i192) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_spam);
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_unknown_sender);
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_harassment);
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.a(p60.b.report_radio_button_self_harm);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Switch r73 = this$0.f130786l;
                            if (r73 != null && (d0Var = this$0.f130781g) != null) {
                                f1 f1Var = r73.isChecked() ? f1.REPORT_AND_BLOCK_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK : f1.REPORT_CONTACT_REQUEST_MESSAGE_CONFIRM_CLICK;
                                String str = this$0.f130776b;
                                if (str == null) {
                                    Intrinsics.r("contactRequestId");
                                    throw null;
                                }
                                d0Var.g(f1Var, str, z0.f(new Pair("contact_request_id", str)), false);
                            }
                            String[] stringArray = this$0.getResources().getStringArray(p60.a.report_contact_request_server_revised_reasons);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            int i232 = this$0.f130779e;
                            if (i232 == p60.b.report_radio_button_spam) {
                                String str2 = stringArray[0];
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                                this$0.b(str2);
                                return;
                            }
                            if (i232 == p60.b.report_radio_button_unknown_sender) {
                                String str3 = stringArray[1];
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                this$0.b(str3);
                                return;
                            } else if (i232 == p60.b.report_radio_button_harassment) {
                                String str4 = stringArray[2];
                                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                                this$0.b(str4);
                                return;
                            } else {
                                if (i232 == p60.b.report_radio_button_self_harm) {
                                    String str5 = stringArray[3];
                                    Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                                    this$0.b(str5);
                                    return;
                                }
                                return;
                            }
                    }
                }
            });
        }
        LinearLayout linearLayout9 = dVar.f130783i;
        k3.R1(linearLayout9 != null ? linearLayout9.findViewById(p60.b.report_radio_button_unknown_sender_container) : null, !dVar.f130778d);
        LinearLayout linearLayout10 = dVar.f130783i;
        k3.R1(linearLayout10 != null ? linearLayout10.findViewById(p60.b.report_radio_button_harassment_container) : null, dVar.f130778d);
        LinearLayout linearLayout11 = dVar.f130783i;
        k3.R1(linearLayout11 != null ? linearLayout11.findViewById(p60.b.report_radio_button_self_harm_container) : null, dVar.f130778d);
        ModalViewWrapper modalViewWrapper2 = this.f126424h;
        if (modalViewWrapper2 == null) {
            Intrinsics.r("viewWrapper");
            throw null;
        }
        modalViewWrapper2.x(dVar);
        ModalViewWrapper modalViewWrapper3 = this.f126424h;
        if (modalViewWrapper3 == null) {
            Intrinsics.r("viewWrapper");
            throw null;
        }
        modalViewWrapper3.p(modalViewWrapper3.getResources().getString(p60.d.report_contact_request_button));
        ModalViewWrapper modalViewWrapper4 = this.f126424h;
        if (modalViewWrapper4 == null) {
            Intrinsics.r("viewWrapper");
            throw null;
        }
        modalViewWrapper4.j(g.f126416i);
        ModalViewWrapper modalViewWrapper5 = this.f126424h;
        if (modalViewWrapper5 != null) {
            return modalViewWrapper5;
        }
        Intrinsics.r("viewWrapper");
        throw null;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.REPORT, null, null, null, null, null);
    }

    @Override // jc0.a0
    public final void onAboutToShow() {
        ModalViewWrapper modalViewWrapper = this.f126424h;
        if (modalViewWrapper != null) {
            modalViewWrapper.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            Intrinsics.r("viewWrapper");
            throw null;
        }
    }
}
