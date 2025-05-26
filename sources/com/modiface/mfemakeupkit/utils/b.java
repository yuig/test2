package com.modiface.mfemakeupkit.utils;

import android.graphics.Color;
import com.appsflyer.AdRevenueScheme;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.modiface.mfemakeupkit.effects.MFEMakeupProduct;
import com.modiface.mfemakeupkit.effects.MFEMakeupProductCategory;
import com.modiface.mfemakeupkit.effects.MFEMakeupProductInfo;
import com.modiface.mfemakeupkit.effects.MFEMakeupShadeInfo;
import com.modiface.mfemakeupkit.utils.MFEMakeupProductInfoParser;
import com.modiface.mfemakeupkit.utils.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/modiface/mfemakeupkit/utils/b;", "", "<init>", "()V", "a", "mfemakeupkit_retailerRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJW\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\n\u0010\u0012JI\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0018J\u0017\u0010\n\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u001bJ\u001f\u0010\n\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\n\u0010\u001fJ9\u0010\n\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\n\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010\n\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b\n\u0010,¨\u0006/"}, d2 = {"Lcom/modiface/mfemakeupkit/utils/b$a;", "", "Lorg/json/JSONObject;", "shadeJson", "Lrl2/j;", "", "property", "", "key", "", "a", "(Lorg/json/JSONObject;Lrl2/j;Ljava/lang/String;)V", "", "Lql2/h;", "", "range", "Lkotlin/Function1;", "valFunc", "(Lorg/json/JSONObject;Lrl2/j;Ljava/lang/String;Lql2/h;Lkotlin/jvm/functions/Function1;)V", "", "keyR", "keyG", "keyB", "keyA", "(Lorg/json/JSONObject;Lrl2/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "categoryString", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupProductCategory;", "(Ljava/lang/String;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupProductCategory;", "Lcom/modiface/mfemakeupkit/utils/a;", "cmsVersion", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupProduct;", "(Lorg/json/JSONObject;Lcom/modiface/mfemakeupkit/utils/a;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupProduct;", "product", "category", AdRevenueScheme.PLACEMENT, "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLayer;", "(Lcom/modiface/mfemakeupkit/effects/MFEMakeupProduct;Lcom/modiface/mfemakeupkit/effects/MFEMakeupProductCategory;Ljava/lang/String;Lorg/json/JSONObject;Lcom/modiface/mfemakeupkit/utils/a;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupLayer;", "dataString", "Lcom/modiface/mfemakeupkit/utils/MFEMakeupProductInfoParser$Result;", "b", "(Ljava/lang/String;)Lcom/modiface/mfemakeupkit/utils/MFEMakeupProductInfoParser$Result;", "Lorg/json/JSONArray;", "lookObject", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "(Lorg/json/JSONArray;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "<init>", "()V", "mfemakeupkit_retailerRelease"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.modiface.mfemakeupkit.utils.b$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.modiface.mfemakeupkit.utils.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0004a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34617a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f34618b;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.v36.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.v35.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.v33.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34617a = iArr;
                int[] iArr2 = new int[MFEMakeupProductCategory.values().length];
                try {
                    iArr2[MFEMakeupProductCategory.Highlight.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Contour.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Blush.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Concealer.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.EyeLiner.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Mascara.ordinal()] = 6;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.FalseLash.ordinal()] = 7;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.EyeShadow.ordinal()] = 8;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Lip.ordinal()] = 9;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.LipLiner.ordinal()] = 10;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Foundation.ordinal()] = 11;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Cushion.ordinal()] = 12;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.SettingSpray.ordinal()] = 13;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Primer.ordinal()] = 14;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Brow.ordinal()] = 15;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[MFEMakeupProductCategory.Undefined.ordinal()] = 16;
                } catch (NoSuchFieldError unused19) {
                }
                f34618b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a(Companion companion, JSONObject jSONObject, rl2.j jVar, String str, String str2, String str3, String str4, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                str4 = null;
            }
            companion.a(jSONObject, jVar, str, str2, str3, str4);
        }

        @NotNull
        public final MFEMakeupProductInfoParser.Result b(@NotNull String dataString) {
            String str;
            Intrinsics.checkNotNullParameter(dataString, "dataString");
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(dataString);
                String cmsVersionStr = jSONObject.getString("cmsVersion");
                a.Companion companion = a.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(cmsVersionStr, "cmsVersionStr");
                a a13 = companion.a(cmsVersionStr);
                if (a13 == null) {
                    throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.VersionMismatch, "Data version (" + cmsVersionStr + ") is incompatible with parser expected versions.");
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("products");
                if (jSONObject2.length() == 0) {
                    throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "No values for brands");
                }
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                    if (optJSONArray == null || optJSONArray.length() != 0) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        if (jSONObject3.length() == 0) {
                            throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "No values for categories");
                        }
                        Iterator<String> keys2 = jSONObject3.keys();
                        while (keys2.hasNext()) {
                            String categoryString = keys2.next();
                            Intrinsics.checkNotNullExpressionValue(categoryString, "categoryString");
                            MFEMakeupProductCategory a14 = a(categoryString);
                            if (a14 == MFEMakeupProductCategory.Undefined) {
                                throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "Undefined value for category");
                            }
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(categoryString);
                            if (jSONObject4.length() == 0) {
                                throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "No values for UPCs");
                            }
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next2 = keys3.next();
                                JSONArray jSONArray = jSONObject4.getJSONObject(next2).getJSONArray("shadeArray");
                                if (jSONArray.length() == 0) {
                                    throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "No values for shades");
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int length = jSONArray.length();
                                int i13 = 0;
                                while (i13 < length) {
                                    JSONObject jSONObject5 = jSONObject2;
                                    JSONObject shadeJson = jSONArray.getJSONObject(i13);
                                    if (shadeJson.length() == 0) {
                                        throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "Empty shade found");
                                    }
                                    int i14 = i13;
                                    Intrinsics.checkNotNullExpressionValue(shadeJson, "shadeJson");
                                    MFEMakeupProduct a15 = a(shadeJson, a13);
                                    String placement = shadeJson.optString(AdRevenueScheme.PLACEMENT, "");
                                    Intrinsics.checkNotNullExpressionValue(placement, "placement");
                                    int i15 = length;
                                    ArrayList arrayList3 = arrayList2;
                                    JSONArray jSONArray2 = jSONArray;
                                    String str2 = next2;
                                    JSONObject jSONObject6 = jSONObject4;
                                    final MFEMakeupShadeInfo mFEMakeupShadeInfo = new MFEMakeupShadeInfo(a(a15, a14, placement, shadeJson, a13));
                                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v(mFEMakeupShadeInfo) { // from class: com.modiface.mfemakeupkit.utils.g0
                                        @Override // rl2.r
                                        public Object get() {
                                            return Float.valueOf(((MFEMakeupShadeInfo) this.receiver).lipPlumping);
                                        }

                                        @Override // rl2.j
                                        public void set(Object obj) {
                                            ((MFEMakeupShadeInfo) this.receiver).lipPlumping = ((Number) obj).floatValue();
                                        }
                                    };
                                    int i16 = C0004a.f34617a[a13.ordinal()];
                                    if (i16 == 1 || i16 == 2) {
                                        str = "lipVolume";
                                    } else {
                                        if (i16 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str = "lipPlumping";
                                    }
                                    a(this, shadeJson, vVar, str, new ql2.f(0.0d, 1.0d), null, 16, null);
                                    arrayList3.add(mFEMakeupShadeInfo);
                                    arrayList2 = arrayList3;
                                    jSONArray = jSONArray2;
                                    jSONObject4 = jSONObject6;
                                    length = i15;
                                    next2 = str2;
                                    jSONObject3 = jSONObject3;
                                    a14 = a14;
                                    i13 = i14 + 1;
                                    jSONObject2 = jSONObject5;
                                }
                                JSONObject jSONObject7 = jSONObject2;
                                String upcString = next2;
                                MFEMakeupProductCategory mFEMakeupProductCategory = a14;
                                MFEMakeupProductInfo mFEMakeupProductInfo = new MFEMakeupProductInfo(next, mFEMakeupProductCategory, upcString, arrayList2);
                                arrayList.add(mFEMakeupProductInfo);
                                Intrinsics.checkNotNullExpressionValue(upcString, "upcString");
                                hashMap.put(upcString, mFEMakeupProductInfo);
                                jSONObject2 = jSONObject7;
                                a14 = mFEMakeupProductCategory;
                                jSONObject4 = jSONObject4;
                                jSONObject3 = jSONObject3;
                            }
                        }
                    }
                }
                return new MFEMakeupProductInfoParser.Result(arrayList, hashMap);
            } catch (JSONException e13) {
                throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "JSON exception thrown", e13);
            }
        }

        private Companion() {
        }

        public static /* synthetic */ void a(Companion companion, JSONObject jSONObject, rl2.j jVar, String str, ql2.h hVar, Function1 function1, int i13, Object obj) {
            companion.a(jSONObject, jVar, str, (i13 & 8) != 0 ? null : hVar, (Function1<? super Double, Double>) ((i13 & 16) != 0 ? null : function1));
        }

        @NotNull
        public final MFEMakeupLook a(@NotNull JSONArray lookObject) {
            Intrinsics.checkNotNullParameter(lookObject, "lookObject");
            MFEMakeupLook mFEMakeupLook = new MFEMakeupLook();
            try {
                if (lookObject.length() != 0) {
                    int length = lookObject.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        JSONObject shadeJson = lookObject.getJSONObject(i13);
                        Intrinsics.checkNotNullExpressionValue(shadeJson, "shadeJson");
                        a aVar = a.v36;
                        MFEMakeupProduct a13 = a(shadeJson, aVar);
                        String string = shadeJson.getString("category");
                        Intrinsics.checkNotNullExpressionValue(string, "shadeJson.getString(kCategory)");
                        MFEMakeupProductCategory a14 = a(string);
                        String placement = shadeJson.optString(AdRevenueScheme.PLACEMENT, "");
                        Intrinsics.checkNotNullExpressionValue(placement, "placement");
                        final MFEMakeupShadeInfo mFEMakeupShadeInfo = new MFEMakeupShadeInfo(a(a13, a14, placement, shadeJson, aVar));
                        a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupShadeInfo) { // from class: com.modiface.mfemakeupkit.utils.h0
                            @Override // rl2.r
                            public Object get() {
                                return Float.valueOf(((MFEMakeupShadeInfo) this.receiver).lipPlumping);
                            }

                            @Override // rl2.j
                            public void set(Object obj) {
                                ((MFEMakeupShadeInfo) this.receiver).lipPlumping = ((Number) obj).floatValue();
                            }
                        }, "lipVolume", new ql2.f(0.0d, 1.0d), null, 16, null);
                        mFEMakeupShadeInfo.applyToLook(mFEMakeupLook, a14, false);
                    }
                    return mFEMakeupLook;
                }
                throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "No values for look products");
            } catch (JSONException e13) {
                throw new MFEMakeupProductInfoParser.ParserException(MFEMakeupProductInfoParser.ErrorCode.DataFormat, "JSON exception thrown", e13);
            }
        }

        private final void a(JSONObject shadeJson, rl2.j property, String key) {
            property.set(Boolean.valueOf(shadeJson.optBoolean(key, ((Boolean) property.get()).booleanValue())));
        }

        private final void a(JSONObject shadeJson, rl2.j property, String key, ql2.h range, Function1<? super Double, Double> valFunc) {
            double optDouble = shadeJson.optDouble(key);
            if (Double.isNaN(optDouble)) {
                return;
            }
            if (range != null) {
                optDouble = ((Number) ql2.s.k(Double.valueOf(optDouble), range)).doubleValue();
            }
            if (valFunc != null) {
                optDouble = ((Number) valFunc.invoke(Double.valueOf(optDouble))).doubleValue();
            }
            property.set(Float.valueOf((float) optDouble));
        }

        private final void a(JSONObject shadeJson, rl2.j property, String keyR, String keyG, String keyB, String keyA) {
            try {
                property.set(Integer.valueOf(Color.argb(keyA != null ? ql2.s.g(shadeJson.getInt(keyA), 0, 255) : 255, ql2.s.g(shadeJson.getInt(keyR), 0, 255), ql2.s.g(shadeJson.getInt(keyG), 0, 255), ql2.s.g(shadeJson.getInt(keyB), 0, 255))));
            } catch (JSONException unused) {
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final MFEMakeupProductCategory a(String categoryString) {
            switch (categoryString.hashCode()) {
                case -2080897869:
                    if (categoryString.equals("foundation")) {
                        return MFEMakeupProductCategory.Foundation;
                    }
                    break;
                case -1967758803:
                    if (categoryString.equals("falselash")) {
                        return MFEMakeupProductCategory.FalseLash;
                    }
                    break;
                case -1356498067:
                    if (categoryString.equals("eyeliner")) {
                        return MFEMakeupProductCategory.EyeLiner;
                    }
                    break;
                case -979984941:
                    if (categoryString.equals("primer")) {
                        return MFEMakeupProductCategory.Primer;
                    }
                    break;
                case -894198404:
                    if (categoryString.equals("concealer")) {
                        return MFEMakeupProductCategory.Concealer;
                    }
                    break;
                case -681210700:
                    if (categoryString.equals("highlight")) {
                        return MFEMakeupProductCategory.Highlight;
                    }
                    break;
                case 3032632:
                    if (categoryString.equals("brow")) {
                        return MFEMakeupProductCategory.Brow;
                    }
                    break;
                case 93838592:
                    if (categoryString.equals("blush")) {
                        return MFEMakeupProductCategory.Blush;
                    }
                    break;
                case 535204957:
                    if (categoryString.equals("settingspray")) {
                        return MFEMakeupProductCategory.SettingSpray;
                    }
                    break;
                case 839932140:
                    if (categoryString.equals("mascara")) {
                        return MFEMakeupProductCategory.Mascara;
                    }
                    break;
                case 951540442:
                    if (categoryString.equals("contour")) {
                        return MFEMakeupProductCategory.Contour;
                    }
                    break;
                case 1097325201:
                    if (categoryString.equals("eyeshadow")) {
                        return MFEMakeupProductCategory.EyeShadow;
                    }
                    break;
                case 1127569505:
                    if (categoryString.equals("cushion")) {
                        return MFEMakeupProductCategory.Cushion;
                    }
                    break;
                case 1244868784:
                    if (categoryString.equals("lipcolor")) {
                        return MFEMakeupProductCategory.Lip;
                    }
                    break;
                case 1253003339:
                    if (categoryString.equals("lipliner")) {
                        return MFEMakeupProductCategory.LipLiner;
                    }
                    break;
            }
            return MFEMakeupProductCategory.Undefined;
        }

        private final MFEMakeupProduct a(JSONObject shadeJson, a cmsVersion) {
            final MFEMakeupProduct mFEMakeupProduct = new MFEMakeupProduct();
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.s0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).intensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).intensity = ((Number) obj).floatValue();
                }
            }, "intensity", new ql2.f(0.0d, 1.0d), null, 16, null);
            int i13 = C0004a.f34617a[cmsVersion.ordinal()];
            if (i13 == 1 || i13 == 2) {
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.d1
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).color);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).color = ((Number) obj).intValue();
                    }
                }, "colorR", "colorG", "colorB", "colorA");
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.p1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).gloss);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).gloss = ((Number) obj).floatValue();
                    }
                }, "gloss", new ql2.f(0.0d, 5.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.x1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleIntensity);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleIntensity = ((Number) obj).floatValue();
                    }
                }, "sparkleIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.y1
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).sparkleColor);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleColor = ((Number) obj).intValue();
                    }
                }, "sparkleR", "sparkleG", "sparkleB", null, 32, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.z1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).specularCoarseness);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).specularCoarseness = ((Number) obj).floatValue();
                    }
                }, "specularCoarseness", new ql2.f(0.0d, 1.0d), null, 16, null);
            } else if (i13 == 3) {
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.a2
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).color);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).color = ((Number) obj).intValue();
                    }
                }, "color_r", "color_g", "color_b", "color_a");
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.b2
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).gloss);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).gloss = ((Number) obj).floatValue();
                    }
                }, "gamma", new ql2.f(0.0d, 5.0d), null, 16, null);
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.c2
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleIntensity);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleIntensity = ((Number) obj).floatValue();
                    }
                }, "sparkle_a", new ql2.f(0.0d, 255.0d), i0.f34678a);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.j0
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).sparkleColor);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleColor = ((Number) obj).intValue();
                    }
                }, "sparkle_r", "sparkle_g", "sparkle_b", null, 32, null);
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.k0
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).specularCoarseness);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).specularCoarseness = ((Number) obj).floatValue();
                    }
                }, "metallicRoughness", new ql2.f(0.0d, 1.0d), l0.f34679a);
            }
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.m0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).glossDetail);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).glossDetail = ((Number) obj).floatValue();
                }
            }, "glossDetail", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.n0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).matteness);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).matteness = ((Number) obj).floatValue();
                }
            }, "matteness", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.o0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).envMappingIntensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).envMappingIntensity = ((Number) obj).floatValue();
                }
            }, "envMappingIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.p0
                @Override // rl2.r
                public Object get() {
                    return Integer.valueOf(((MFEMakeupProduct) this.receiver).envMappingColor);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).envMappingColor = ((Number) obj).intValue();
                }
            }, "envMappingR", "envMappingG", "envMappingB", null, 32, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.q0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).envMappingRotationY);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).envMappingRotationY = ((Number) obj).floatValue();
                }
            }, "envMappingRotationY", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.r0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).envMappingCurve);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).envMappingCurve = ((Number) obj).floatValue();
                }
            }, "envMappingCurve", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.t0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).envMappingBumpIntensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).envMappingBumpIntensity = ((Number) obj).floatValue();
                }
            }, "envMappingBumpIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.u0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleDensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).sparkleDensity = ((Number) obj).floatValue();
                }
            }, "sparkleDensity", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.v0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleSize);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).sparkleSize = ((Number) obj).floatValue();
                }
            }, "sparkleSize", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.w0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleBaseReflectivity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).sparkleBaseReflectivity = ((Number) obj).floatValue();
                }
            }, "sparkleBaseReflectivity", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.x0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleColorVariation);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).sparkleColorVariation = ((Number) obj).floatValue();
                }
            }, "sparkleColorVariation", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.y0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleSizeVariation);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).sparkleSizeVariation = ((Number) obj).floatValue();
                }
            }, "sparkleSizeVariation", null, null, 24, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.z0
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).skinClearing);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).skinClearing = ((Number) obj).floatValue();
                }
            }, "skinClearing", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.a1
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).skinGlow);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).skinGlow = ((Number) obj).floatValue();
                }
            }, "skinGlow", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.b1
                @Override // rl2.r
                public Object get() {
                    return Boolean.valueOf(((MFEMakeupProduct) this.receiver).isSkinGlowDynamicByRotation);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).isSkinGlowDynamicByRotation = ((Boolean) obj).booleanValue();
                }
            }, "isSkinGlowDynamicByRotation");
            a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.c1
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).contrastBoost);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).contrastBoost = ((Number) obj).floatValue();
                }
            }, "contrastBoost", new ql2.f(0.0d, 1.0d), e1.f34675a);
            a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.g1
                @Override // rl2.r
                public Object get() {
                    return Boolean.valueOf(((MFEMakeupProduct) this.receiver).useDynamicColor);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).useDynamicColor = ((Boolean) obj).booleanValue();
                }
            }, "enableDynamicColor");
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.h1
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).metallicIntensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).metallicIntensity = ((Number) obj).floatValue();
                }
            }, "metallicIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
            a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.i1
                @Override // rl2.r
                public Object get() {
                    return Float.valueOf(((MFEMakeupProduct) this.receiver).vinylIntensity);
                }

                @Override // rl2.j
                public void set(Object obj) {
                    ((MFEMakeupProduct) this.receiver).vinylIntensity = ((Number) obj).floatValue();
                }
            }, "vinylIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
            if (cmsVersion == a.v36) {
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.j1
                    @Override // rl2.r
                    public Object get() {
                        return Boolean.valueOf(((MFEMakeupProduct) this.receiver).useIntenseDynamicColorParameters);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).useIntenseDynamicColorParameters = ((Boolean) obj).booleanValue();
                    }
                }, "useIntenseDynamicColorParameters");
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.k1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).sparkleGlowSize);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleGlowSize = ((Number) obj).floatValue();
                    }
                }, "sparkleGlowSize", null, null, 24, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.l1
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).sparkleGlowColor);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).sparkleGlowColor = ((Number) obj).intValue();
                    }
                }, "sparkleGlowR", "sparkleGlowG", "sparkleGlowB", null, 32, null);
                a(shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.m1
                    @Override // rl2.r
                    public Object get() {
                        return Boolean.valueOf(((MFEMakeupProduct) this.receiver).useLegacyGlitter);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).useLegacyGlitter = ((Boolean) obj).booleanValue();
                    }
                }, "useLegacyGlitter");
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.n1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).twinkleIntensity);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleIntensity = ((Number) obj).floatValue();
                    }
                }, "twinkleIntensity", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.o1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).twinkleDensity);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleDensity = ((Number) obj).floatValue();
                    }
                }, "twinkleDensity", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.q1
                    @Override // rl2.r
                    public Object get() {
                        return Integer.valueOf(((MFEMakeupProduct) this.receiver).twinkleColor);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleColor = ((Number) obj).intValue();
                    }
                }, "twinkleR", "twinkleG", "twinkleB", null, 32, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.r1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).twinkleSize);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleSize = ((Number) obj).floatValue();
                    }
                }, "twinkleSize", new ql2.f(0.5d, 1.2d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.s1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).twinkleSizeVariation);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleSizeVariation = ((Number) obj).floatValue();
                    }
                }, "twinkleSizeVariation", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.t1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).twinkleColorVariation);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).twinkleColorVariation = ((Number) obj).floatValue();
                    }
                }, "twinkleColorVariation", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.u1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).textureBoost);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).textureBoost = ((Number) obj).floatValue();
                    }
                }, "textureBoost", new ql2.f(-1.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.v1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).lustre);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).lustre = ((Number) obj).floatValue();
                    }
                }, "lustre", new ql2.f(0.0d, 1.0d), null, 16, null);
                a(this, shadeJson, new kotlin.jvm.internal.v(mFEMakeupProduct) { // from class: com.modiface.mfemakeupkit.utils.w1
                    @Override // rl2.r
                    public Object get() {
                        return Float.valueOf(((MFEMakeupProduct) this.receiver).blushGlow);
                    }

                    @Override // rl2.j
                    public void set(Object obj) {
                        ((MFEMakeupProduct) this.receiver).blushGlow = ((Number) obj).floatValue();
                    }
                }, "blushGlow", new ql2.f(0.0d, 1.0d), null, 16, null);
            } else {
                mFEMakeupProduct.useLegacyGlitter = true;
            }
            return mFEMakeupProduct;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x054b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final com.modiface.mfemakeupkit.effects.MFEMakeupLayer a(final com.modiface.mfemakeupkit.effects.MFEMakeupProduct r24, com.modiface.mfemakeupkit.effects.MFEMakeupProductCategory r25, java.lang.String r26, org.json.JSONObject r27, com.modiface.mfemakeupkit.utils.a r28) {
            /*
                Method dump skipped, instructions count: 1676
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.utils.b.Companion.a(com.modiface.mfemakeupkit.effects.MFEMakeupProduct, com.modiface.mfemakeupkit.effects.MFEMakeupProductCategory, java.lang.String, org.json.JSONObject, com.modiface.mfemakeupkit.utils.a):com.modiface.mfemakeupkit.effects.MFEMakeupLayer");
        }
    }

    @NotNull
    public static final MFEMakeupLook a(@NotNull JSONArray jSONArray) {
        return INSTANCE.a(jSONArray);
    }

    @NotNull
    public static final MFEMakeupProductInfoParser.Result a(@NotNull String str) {
        return INSTANCE.b(str);
    }
}
