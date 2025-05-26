package d50;

import c50.t6;
import com.appsflyer.AdRevenueScheme;
import kotlin.jvm.internal.Intrinsics;
import pc.c;
import pc.q0;
import pc.r0;
import pc.v;
import tc.f;
import tc.g;

/* loaded from: classes5.dex */
public final class b implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f53683a = new b();

    @Override // pc.a
    public final void d(g writer, v customScalarAdapters, Object obj) {
        t6 value = (t6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f26313a instanceof q0) {
            writer.M0("about");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26313a);
        }
        r0 r0Var = value.f26315b;
        if (r0Var instanceof q0) {
            writer.M0("accountType");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f26317c;
        if (r0Var2 instanceof q0) {
            writer.M0("additionalLocalesToAdd");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var2);
        }
        r0 r0Var3 = value.f26319d;
        if (r0Var3 instanceof q0) {
            writer.M0("additionalLocalesToRemove");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var3);
        }
        r0 r0Var4 = value.f26321e;
        if (r0Var4 instanceof q0) {
            writer.M0("additionalWebsiteUrls");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var4);
        }
        r0 r0Var5 = value.f26323f;
        if (r0Var5 instanceof q0) {
            writer.M0("adsCustomizeFromConversion");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var5);
        }
        r0 r0Var6 = value.f26325g;
        if (r0Var6 instanceof q0) {
            writer.M0("advertisingIntent");
            c.d(c.f99526g).a(writer, customScalarAdapters, (q0) r0Var6);
        }
        r0 r0Var7 = value.f26327h;
        if (r0Var7 instanceof q0) {
            writer.M0("age");
            c.d(c.f99526g).a(writer, customScalarAdapters, (q0) r0Var7);
        }
        r0 r0Var8 = value.f26329i;
        if (r0Var8 instanceof q0) {
            writer.M0("agencyBusinessData");
            c.d(c.b(c.c(a.f53682a))).a(writer, customScalarAdapters, (q0) r0Var8);
        }
        r0 r0Var9 = value.f26331j;
        if (r0Var9 instanceof q0) {
            writer.M0("allowAnalyticCookies");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var9);
        }
        r0 r0Var10 = value.f26333k;
        if (r0Var10 instanceof q0) {
            writer.M0("allowIdeaPinDownloads");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var10);
        }
        r0 r0Var11 = value.f26335l;
        if (r0Var11 instanceof q0) {
            writer.M0("allowMarketingCookies");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var11);
        }
        r0 r0Var12 = value.f26337m;
        if (r0Var12 instanceof q0) {
            writer.M0("allowMentions");
            c.d(c.f99526g).a(writer, customScalarAdapters, (q0) r0Var12);
        }
        r0 r0Var13 = value.f26339n;
        if (r0Var13 instanceof q0) {
            writer.M0("allowPersonalizationCookies");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var13);
        }
        r0 r0Var14 = value.f26341o;
        if (r0Var14 instanceof q0) {
            writer.M0("allowTagging");
            c.d(c.f99526g).a(writer, customScalarAdapters, (q0) r0Var14);
        }
        r0 r0Var15 = value.f26343p;
        if (r0Var15 instanceof q0) {
            writer.M0("birthdate");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var15);
        }
        r0 r0Var16 = value.f26345q;
        if (r0Var16 instanceof q0) {
            writer.M0("businessDiversityCategory");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var16);
        }
        r0 r0Var17 = value.f26347r;
        if (r0Var17 instanceof q0) {
            writer.M0("businessGoals");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var17);
        }
        r0 r0Var18 = value.f26349s;
        if (r0Var18 instanceof q0) {
            writer.M0("businessName");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var18);
        }
        r0 r0Var19 = value.f26351t;
        if (r0Var19 instanceof q0) {
            writer.M0("businessVertical");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var19);
        }
        r0 r0Var20 = value.f26353u;
        if (r0Var20 instanceof q0) {
            writer.M0("businessVerticalOther");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var20);
        }
        r0 r0Var21 = value.f26355v;
        if (r0Var21 instanceof q0) {
            writer.M0("ccpaOptedOut");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var21);
        }
        r0 r0Var22 = value.f26357w;
        if (r0Var22 instanceof q0) {
            writer.M0("commentsDisabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var22);
        }
        r0 r0Var23 = value.f26359x;
        if (r0Var23 instanceof q0) {
            writer.M0("contactName");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var23);
        }
        r0 r0Var24 = value.f26360y;
        if (r0Var24 instanceof q0) {
            writer.M0(AdRevenueScheme.COUNTRY);
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var24);
        }
        r0 r0Var25 = value.f26361z;
        if (r0Var25 instanceof q0) {
            writer.M0("customGender");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var25);
        }
        r0 r0Var26 = value.A;
        if (r0Var26 instanceof q0) {
            writer.M0("dailyAdsBudget");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var26);
        }
        r0 r0Var27 = value.B;
        if (r0Var27 instanceof q0) {
            writer.M0("deleteBusinessDiversityCategory");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var27);
        }
        r0 r0Var28 = value.C;
        if (r0Var28 instanceof q0) {
            writer.M0("dsaOptedOut");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var28);
        }
        r0 r0Var29 = value.D;
        if (r0Var29 instanceof q0) {
            writer.M0("email");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var29);
        }
        r0 r0Var30 = value.E;
        if (r0Var30 instanceof q0) {
            writer.M0("emailBounced");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var30);
        }
        r0 r0Var31 = value.F;
        if (r0Var31 instanceof q0) {
            writer.M0("enableProfileAddress");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var31);
        }
        r0 r0Var32 = value.G;
        if (r0Var32 instanceof q0) {
            writer.M0("enableProfileMessage");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var32);
        }
        r0 r0Var33 = value.H;
        if (r0Var33 instanceof q0) {
            writer.M0("excludeFromSearch");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var33);
        }
        r0 r0Var34 = value.I;
        if (r0Var34 instanceof q0) {
            writer.M0("facebookPublishStreamEnabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var34);
        }
        r0 r0Var35 = value.f26312J;
        if (r0Var35 instanceof q0) {
            writer.M0("facebookTimelineEnabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var35);
        }
        r0 r0Var36 = value.K;
        if (r0Var36 instanceof q0) {
            writer.M0("firstName");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var36);
        }
        r0 r0Var37 = value.L;
        if (r0Var37 instanceof q0) {
            writer.M0("firstPartyAdsPersonalizationEnabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var37);
        }
        r0 r0Var38 = value.M;
        if (r0Var38 instanceof q0) {
            writer.M0("gender");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var38);
        }
        r0 r0Var39 = value.N;
        if (r0Var39 instanceof q0) {
            writer.M0("hideFromNews");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var39);
        }
        r0 r0Var40 = value.O;
        if (r0Var40 instanceof q0) {
            writer.M0("impressumUrl");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var40);
        }
        r0 r0Var41 = value.P;
        if (r0Var41 instanceof q0) {
            writer.M0("ipStelaRecDisabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var41);
        }
        r0 r0Var42 = value.Q;
        if (r0Var42 instanceof q0) {
            writer.M0("isKnownFacebookUser");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var42);
        }
        r0 r0Var43 = value.R;
        if (r0Var43 instanceof q0) {
            writer.M0("lastName");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var43);
        }
        r0 r0Var44 = value.S;
        if (r0Var44 instanceof q0) {
            writer.M0("listedWebsiteUrl");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var44);
        }
        r0 r0Var45 = value.T;
        if (r0Var45 instanceof q0) {
            writer.M0("locale");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var45);
        }
        r0 r0Var46 = value.U;
        if (r0Var46 instanceof q0) {
            writer.M0("location");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var46);
        }
        r0 r0Var47 = value.V;
        if (r0Var47 instanceof q0) {
            writer.M0("marketingPlanName");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var47);
        }
        r0 r0Var48 = value.W;
        if (r0Var48 instanceof q0) {
            writer.M0("messagingPermissions");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var48);
        }
        r0 r0Var49 = value.X;
        if (r0Var49 instanceof q0) {
            writer.M0("numberEmployees");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var49);
        }
        r0 r0Var50 = value.Y;
        if (r0Var50 instanceof q0) {
            writer.M0("optInPrivateAccount");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var50);
        }
        r0 r0Var51 = value.Z;
        if (r0Var51 instanceof q0) {
            writer.M0("parentEmail");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var51);
        }
        r0 r0Var52 = value.f26314a0;
        if (r0Var52 instanceof q0) {
            writer.M0("partnerContactEmail");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var52);
        }
        r0 r0Var53 = value.f26316b0;
        if (r0Var53 instanceof q0) {
            writer.M0("partnerContactPhone");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var53);
        }
        r0 r0Var54 = value.f26318c0;
        if (r0Var54 instanceof q0) {
            writer.M0("partnerContactPhoneCountry");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var54);
        }
        r0 r0Var55 = value.f26320d0;
        if (r0Var55 instanceof q0) {
            writer.M0("partnerPlaceDict");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var55);
        }
        r0 r0Var56 = value.f26322e0;
        if (r0Var56 instanceof q0) {
            writer.M0("passcode");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var56);
        }
        r0 r0Var57 = value.f26324f0;
        if (r0Var57 instanceof q0) {
            writer.M0("personalizeFromOffsiteBrowsing");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var57);
        }
        r0 r0Var58 = value.f26326g0;
        if (r0Var58 instanceof q0) {
            writer.M0("personalizeNuxFromOffsiteBrowsing");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var58);
        }
        r0 r0Var59 = value.f26328h0;
        if (r0Var59 instanceof q0) {
            writer.M0("pfyPreference");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var59);
        }
        r0 r0Var60 = value.f26330i0;
        if (r0Var60 instanceof q0) {
            writer.M0("profileImage");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var60);
        }
        r0 r0Var61 = value.f26332j0;
        if (r0Var61 instanceof q0) {
            writer.M0("profileImageUrl");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var61);
        }
        r0 r0Var62 = value.f26334k0;
        if (r0Var62 instanceof q0) {
            writer.M0("profileTabVisibility");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var62);
        }
        r0 r0Var63 = value.f26336l0;
        if (r0Var63 instanceof q0) {
            writer.M0("pronouns");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var63);
        }
        r0 r0Var64 = value.f26338m0;
        if (r0Var64 instanceof q0) {
            writer.M0("selectedEcommercePlatforms");
            c.d(c.b(c.a(c.f99524e))).a(writer, customScalarAdapters, (q0) r0Var64);
        }
        r0 r0Var65 = value.f26340n0;
        if (r0Var65 instanceof q0) {
            writer.M0("shoppingRecDisabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var65);
        }
        r0 r0Var66 = value.f26342o0;
        if (r0Var66 instanceof q0) {
            writer.M0("showAllPins");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) r0Var66);
        }
        if (value.f26344p0 instanceof q0) {
            writer.M0("showShoppingList");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) value.f26344p0);
        }
        if (value.f26346q0 instanceof q0) {
            writer.M0("sourceSite");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26346q0);
        }
        if (value.f26348r0 instanceof q0) {
            writer.M0("surfaceTag");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26348r0);
        }
        if (value.f26350s0 instanceof q0) {
            writer.M0("thirdPartyAdsPersonalization");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) value.f26350s0);
        }
        if (value.f26352t0 instanceof q0) {
            writer.M0("thirdPartyMarketingTrackingEnabled");
            c.d(c.f99527h).a(writer, customScalarAdapters, (q0) value.f26352t0);
        }
        if (value.f26354u0 instanceof q0) {
            writer.M0("topBusinessGoal");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26354u0);
        }
        if (value.f26356v0 instanceof q0) {
            writer.M0("username");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26356v0);
        }
        if (value.f26358w0 instanceof q0) {
            writer.M0("websiteUrl");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) value.f26358w0);
        }
    }

    @Override // pc.a
    public final Object f(f fVar, v vVar) {
        throw d7.g.g(fVar, "reader", vVar, "customScalarAdapters", "Input type used in output position");
    }
}
