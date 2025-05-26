package com.pinterest.ui.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.appsflyer.AdRevenueScheme;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import h32.d4;
import h32.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import k42.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import nm.o;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import vn1.b;
import vn1.c;
import vy.m;
import xo.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/ui/view/NoticeView;", "Landroid/widget/LinearLayout;", "gi2/b", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoticeView extends s {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f52709r = 0;

    /* renamed from: d, reason: collision with root package name */
    public m f52710d;

    /* renamed from: e, reason: collision with root package name */
    public final b f52711e;

    /* renamed from: f, reason: collision with root package name */
    public c f52712f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f52713g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f52714h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f52715i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f52716j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f52717k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f52718l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f52719m;

    /* renamed from: n, reason: collision with root package name */
    public final int f52720n;

    /* renamed from: o, reason: collision with root package name */
    public final int f52721o;

    /* renamed from: p, reason: collision with root package name */
    public final int f52722p;

    /* renamed from: q, reason: collision with root package name */
    public final int f52723q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoticeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.pinterest.api.model.ay r30, nx.d0 r31, java.util.HashMap r32) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.view.NoticeView.i(com.pinterest.api.model.ay, nx.d0, java.util.HashMap):void");
    }

    public final void j(String str) {
        if (str == null) {
            return;
        }
        try {
            Context context = getContext();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            Object obj = a.f53679a;
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String text = getContext().getString(f.safe_start_activity_fallback_toast);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            Toast.makeText(context2, text, 0).show();
        }
    }

    public final void k(d0 d0Var, String str, HashMap hashMap) {
        d4 d4Var;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("app", hf0.b.a().name());
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (c0.y(new String[]{"advisory_level", "advisory_type", "resource_country", "url", "object_type"}, (String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            hashMap2.putAll(linkedHashMap);
        }
        if (Intrinsics.d(str, "client.events.searchAdvisories.view")) {
            i0 p13 = d0Var.p();
            String lowerCase = String.valueOf((p13 == null || (d4Var = p13.f67081a) == null) ? null : d4Var.name()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            hashMap2.put(AdRevenueScheme.PLACEMENT, lowerCase);
        }
        Map b13 = y0.b(new Pair("tags", hashMap2));
        o oVar = vd0.c.f125622b;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("aux_data", oVar.k(b13));
        m mVar = this.f52710d;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        mVar.l(str, hashMap3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoticeView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, false, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NoticeView(android.content.Context r9, android.util.AttributeSet r10, int r11, boolean r12, int r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.view.NoticeView.<init>(android.content.Context, android.util.AttributeSet, int, boolean, int):void");
    }
}
