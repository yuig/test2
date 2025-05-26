package com.pinterest.activity.user;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import e12.e;
import g92.g;
import h32.a4;
import h32.d4;
import i92.k;
import ir.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import nr.a;
import nr.n;
import nz1.d;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import wj2.c;
import x02.x2;
import xj2.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/activity/user/UserSetImageActivity;", "Lnr/a;", "<init>", "()V", "zq/a", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserSetImageActivity extends a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f35226j = 0;

    /* renamed from: c, reason: collision with root package name */
    public so1.a f35228c;

    /* renamed from: d, reason: collision with root package name */
    public k f35229d;

    /* renamed from: e, reason: collision with root package name */
    public e f35230e;

    /* renamed from: f, reason: collision with root package name */
    public x2 f35231f;

    /* renamed from: g, reason: collision with root package name */
    public g f35232g;

    /* renamed from: b, reason: collision with root package name */
    public final b f35227b = new b();

    /* renamed from: h, reason: collision with root package name */
    public final d4 f35233h = d4.USER;

    /* renamed from: i, reason: collision with root package name */
    public final a4 f35234i = a4.USER_EDIT;

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f35228c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return null;
    }

    @Override // cp1.p, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF72616t0() {
        return this.f35234i;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF72615s0() {
        return this.f35233h;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f35232g;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        setContentView(d.activity_user_set_image);
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f35227b.dispose();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        byte[] bArr;
        super.onResume();
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("com.pinterest.EXTRA_PHOTO_PATH") : null;
        if (string == null) {
            finish();
            return;
        }
        Uri fromFile = Uri.fromFile(new File(string));
        if (fromFile == null) {
            finish();
            return;
        }
        Bitmap k13 = qb0.b.k(this, fromFile, 640, 480);
        if (k13 == null) {
            finish();
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k13.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            try {
                byteArrayOutputStream.flush();
                bArr = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(bArr, "toByteArray(...)");
                byteArrayOutputStream.close();
            } catch (IOException unused) {
                k13.recycle();
                bArr = null;
            }
            if (bArr != null) {
                RequestBody.Companion companion = RequestBody.f95711a;
                MediaType.f95651d.getClass();
                int i13 = 6;
                RequestBody$Companion$toRequestBody$2 e13 = RequestBody.Companion.e(companion, bArr, MediaType.Companion.b("image/jpeg"), 6);
                MultipartBody.Part.f95670c.getClass();
                MultipartBody.Part b13 = MultipartBody.Part.Companion.b("profile_image", "profilepicture.jpg", e13);
                e eVar = this.f35230e;
                if (eVar != null) {
                    this.f35227b.a(eVar.b(b13).r(tk2.e.f118017c).l(c.a()).o(new h(i13, new n(this, 2)), new h(7, new n(this, 3))));
                } else {
                    Intrinsics.r("myUserService");
                    throw null;
                }
            }
        } finally {
            k13.recycle();
        }
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f35228c == null) {
            this.f35228c = (so1.a) o.a(this, so1.a.class);
        }
    }
}
