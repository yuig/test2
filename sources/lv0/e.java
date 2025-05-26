package lv0;

import android.os.Bundle;
import android.widget.FrameLayout;
import bv0.k;
import com.pinterest.error.ServerError;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import df.j1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import jk2.a0;
import jk2.q0;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import nm.q;
import nm.u;
import nm.v;
import v.f1;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f85002j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f85003k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, String str, int i13) {
        super(1);
        this.f85001i = i13;
        this.f85002j = fVar;
        this.f85003k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        byte[] bArr;
        int i13 = this.f85001i;
        String str2 = this.f85003k;
        final f fVar = this.f85002j;
        final ArrayList arrayList = null;
        switch (i13) {
            case 0:
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.g(c13, "null cannot be cast to non-null type com.google.gson.JsonObject");
                u uVar = (u) c13;
                nm.s v13 = uVar.v("landing_url");
                if (v13 != null) {
                    fVar.f85007d = v13.p();
                    fVar.f85005b = str2;
                }
                q qVar = (q) uVar.v("images");
                if (qVar != null) {
                    arrayList = new ArrayList(g0.q(qVar, 10));
                    Iterator it = qVar.f91364a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nm.s) it.next()).p());
                    }
                }
                final ArrayList arrayList2 = new ArrayList();
                final boolean b13 = uVar.v("is_affiliate_link").b();
                if (arrayList != null) {
                    fVar.getClass();
                    q0 q0Var = new q0(new a0(uj2.q.w(arrayList), new ev0.g(14, new au0.f(arrayList2, 20)), ck2.i.f27924d, ck2.i.f27923c), new k(26, b.f84981k));
                    Intrinsics.checkNotNullExpressionValue(q0Var, "flatMapCompletable(...)");
                    ek2.f i14 = q0Var.l(tk2.e.f118017c).h(wj2.c.a()).i(new ak2.a() { // from class: lv0.d
                        @Override // ak2.a
                        public final void run() {
                            Bundle f49207c;
                            ArrayList imageUrls = arrayList2;
                            Intrinsics.checkNotNullParameter(imageUrls, "$imageList");
                            f this$0 = fVar;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (imageUrls.isEmpty()) {
                                imageUrls.add(arrayList.get(0));
                            }
                            jv0.e eVar = (jv0.e) this$0.getView();
                            boolean z13 = b13 || this$0.f85006c != null;
                            String productLink = this$0.f85005b;
                            String str3 = null;
                            if (productLink == null) {
                                Intrinsics.r("productLink");
                                throw null;
                            }
                            String str4 = this$0.f85006c;
                            String str5 = this$0.f85007d;
                            mv0.k kVar = (mv0.k) eVar;
                            kVar.getClass();
                            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
                            Intrinsics.checkNotNullParameter(productLink, "productLink");
                            GestaltSpinner gestaltSpinner = kVar.f88376n0;
                            if (gestaltSpinner == null) {
                                Intrinsics.r("gestaltSpinner");
                                throw null;
                            }
                            s0.w(gestaltSpinner, mv0.g.f88355r);
                            GestaltSearchField gestaltSearchField = kVar.f88373k0;
                            if (gestaltSearchField == null) {
                                Intrinsics.r("productLinkView");
                                throw null;
                            }
                            hf0.b.k(gestaltSearchField);
                            NavigationImpl w13 = Navigation.w1(d2.o());
                            w13.d("com.pinterest.EXTRA_PINNABLE_IMAGE", imageUrls);
                            w13.Y1("com.pinterest.EXTRA_STORY_PIN_DISPLAY_AFFILIATE_OPTIONS", z13);
                            w13.Y1("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", com.bumptech.glide.d.G(kVar, "com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", false));
                            if (str4 != null) {
                                w13.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_AFFILIATE_LINK", str4);
                            }
                            w13.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_PRODUCT_LINK", productLink);
                            if (str5 != null) {
                                w13.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LANDING_URL", str5);
                            }
                            ScreenDescription screenDescription = kVar.f76937a;
                            if (screenDescription != null && (f49207c = screenDescription.getF49207c()) != null) {
                                str3 = f49207c.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID");
                            }
                            if (str3 != null) {
                                w13.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_PRODUCT_PIN_ID", str3);
                            }
                            kVar.M1(w13);
                        }
                    }, new ev0.g(17, b.f84982l));
                    Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
                    fVar.addDisposable(i14);
                }
                return Unit.f80348a;
            default:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                f1 f1Var = ((ServerError) throwable).f45043a;
                if (f1Var == null || (bArr = (byte[]) f1Var.f123451d) == null) {
                    str = null;
                } else {
                    Charset defaultCharset = Charset.defaultCharset();
                    Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset(...)");
                    str = new String(bArr, defaultCharset);
                }
                u i15 = j1.p1(str).i();
                int i16 = 0;
                if (i15.v("code") != null) {
                    nm.s v14 = i15.v("code");
                    v14.getClass();
                    if (v14 instanceof v) {
                        try {
                            i16 = i15.v("code").e();
                        } catch (Exception unused) {
                        }
                    }
                }
                String error = "";
                if (i16 != 1) {
                    if (i16 == 272) {
                        u i17 = j1.p1(str).i();
                        if (i17.v("message_detail") != null) {
                            try {
                                error = i17.v("message_detail").p();
                            } catch (Exception unused2) {
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(error, "optString(...)");
                        if (fVar.isBound()) {
                            mv0.k kVar = (mv0.k) ((jv0.e) fVar.getView());
                            kVar.getClass();
                            Intrinsics.checkNotNullParameter(error, "error");
                            kVar.b8(error);
                        }
                    } else if (i16 != 2912) {
                        if (i16 != 2920) {
                            mv0.k kVar2 = (mv0.k) ((jv0.e) fVar.getView());
                            String string = kVar2.getResources().getString(x0.error_msg_product_tag_not_supported_for_domain);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            kVar2.b8(string);
                        } else {
                            fVar.f85006c = str2;
                            mv0.k kVar3 = (mv0.k) ((jv0.e) fVar.getView());
                            GestaltSearchField gestaltSearchField = kVar3.f88373k0;
                            if (gestaltSearchField == null) {
                                Intrinsics.r("productLinkView");
                                throw null;
                            }
                            c0.d.j(gestaltSearchField, mv0.g.f88353p);
                            GestaltText gestaltText = kVar3.f88375m0;
                            if (gestaltText == null) {
                                Intrinsics.r("subHeaderDetailsView");
                                throw null;
                            }
                            pk.a0.k0(gestaltText);
                            FrameLayout frameLayout = kVar3.f88374l0;
                            if (frameLayout == null) {
                                Intrinsics.r("headerDetailsViewBackground");
                                throw null;
                            }
                            bs1.c.U1(frameLayout);
                            GestaltSpinner gestaltSpinner = kVar3.f88376n0;
                            if (gestaltSpinner == null) {
                                Intrinsics.r("gestaltSpinner");
                                throw null;
                            }
                            s0.w(gestaltSpinner, mv0.g.f88354q);
                            GestaltSearchField gestaltSearchField2 = kVar3.f88373k0;
                            if (gestaltSearchField2 == null) {
                                Intrinsics.r("productLinkView");
                                throw null;
                            }
                            hf0.b.s(gestaltSearchField2);
                        }
                    }
                    return Unit.f80348a;
                }
                u i18 = j1.p1(str).i();
                if (i18.v("message") != null) {
                    try {
                        error = i18.v("message").p();
                    } catch (Exception unused3) {
                    }
                }
                Intrinsics.checkNotNullExpressionValue(error, "optString(...)");
                if (fVar.isBound()) {
                    ((mv0.k) ((jv0.e) fVar.getView())).b8(error);
                }
                return Unit.f80348a;
        }
    }
}
