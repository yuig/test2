package androidx.recyclerview.widget;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.k9;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import oi.f7;
import oi.g4;
import oi.u4;
import oi.v4;
import oi.y3;
import oi.y5;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19360a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19365f;

    public /* synthetic */ e(y5 y5Var, int i13, IOException iOException, byte[] bArr, Map map) {
        this.f19362c = y5Var;
        this.f19361b = i13;
        this.f19363d = iOException;
        this.f19364e = bArr;
        this.f19365f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19360a) {
            case 0:
                ((f) this.f19365f).f19372c.execute(new androidx.appcompat.widget.j(9, this, a0.e(new d(this))));
                break;
            default:
                y5 y5Var = (y5) this.f19362c;
                int i13 = this.f19361b;
                Exception exc = (Exception) this.f19363d;
                byte[] bArr = (byte[]) this.f19364e;
                u4 u4Var = ((v4) y5Var.f95288f).f95230a;
                y3 y3Var = u4Var.f95205i;
                if ((i13 != 200 && i13 != 204 && i13 != 304) || exc != null) {
                    u4.d(y3Var);
                    y3Var.f95271i.a(Integer.valueOf(i13), exc, "Network Request for Deferred Deep Link failed. response, exception");
                    break;
                } else {
                    g4 g4Var = u4Var.f95204h;
                    u4.c(g4Var);
                    g4Var.f94784s.f(true);
                    if (bArr == null || bArr.length == 0) {
                        u4.d(y3Var);
                        y3Var.f95275m.c("Deferred Deep Link response empty.");
                        break;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String optString = jSONObject.optString("deeplink", "");
                            String optString2 = jSONObject.optString("gclid", "");
                            String optString3 = jSONObject.optString("gbraid", "");
                            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(optString)) {
                                u4.d(y3Var);
                                y3Var.f95275m.c("Deferred Deep Link is empty.");
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                k9.a();
                                boolean x13 = u4Var.f95203g.x(null, oi.s.P0);
                                f7 f7Var = u4Var.f95208l;
                                if (!x13) {
                                    u4.c(f7Var);
                                    if (!f7Var.v0(optString)) {
                                        u4.d(y3Var);
                                        y3Var.f95271i.a(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                                        break;
                                    }
                                } else {
                                    u4.c(f7Var);
                                    if (!f7Var.v0(optString)) {
                                        u4.d(y3Var);
                                        y3Var.f95271i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                                        break;
                                    } else {
                                        bundle.putString("gbraid", optString3);
                                    }
                                }
                                bundle.putString("gclid", optString2);
                                bundle.putString("_cis", "ddp");
                                u4Var.f95212p.W("auto", "_cmp", bundle);
                                u4.c(f7Var);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = f7Var.zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            f7Var.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            break;
                                        }
                                    } catch (RuntimeException e13) {
                                        f7Var.zzj().f95268f.b(e13, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                            }
                        } catch (JSONException e14) {
                            u4.d(y3Var);
                            y3Var.f95268f.b(e14, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                }
                break;
        }
    }

    public e(f fVar, List list, List list2, int i13, p4.a aVar) {
        this.f19365f = fVar;
        this.f19362c = list;
        this.f19363d = list2;
        this.f19361b = i13;
        this.f19364e = aVar;
    }
}
