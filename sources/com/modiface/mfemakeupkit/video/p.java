package com.modiface.mfemakeupkit.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class p {
    static final int A = 100;

    /* renamed from: o, reason: collision with root package name */
    static final String f34735o = "video/avc";

    /* renamed from: p, reason: collision with root package name */
    static final int f34736p = 15;

    /* renamed from: q, reason: collision with root package name */
    static final int f34737q = 0;

    /* renamed from: r, reason: collision with root package name */
    static final int f34738r = 100;

    /* renamed from: u, reason: collision with root package name */
    static final String f34741u = "audio/mp4a-latm";

    /* renamed from: v, reason: collision with root package name */
    static final int f34742v = 44100;

    /* renamed from: w, reason: collision with root package name */
    static final int f34743w = 64000;

    /* renamed from: x, reason: collision with root package name */
    static final int f34744x = 1024;

    /* renamed from: y, reason: collision with root package name */
    static final int f34745y = 25;

    /* renamed from: z, reason: collision with root package name */
    static final int f34746z = 100;

    /* renamed from: a, reason: collision with root package name */
    String f34747a = f34735o;

    /* renamed from: b, reason: collision with root package name */
    int f34748b = 15;

    /* renamed from: c, reason: collision with root package name */
    int f34749c = 0;

    /* renamed from: d, reason: collision with root package name */
    int[] f34750d = f34739s;

    /* renamed from: e, reason: collision with root package name */
    Integer[] f34751e = f34740t;

    /* renamed from: f, reason: collision with root package name */
    int f34752f = 100;

    /* renamed from: g, reason: collision with root package name */
    String f34753g = f34741u;

    /* renamed from: h, reason: collision with root package name */
    int f34754h = f34742v;

    /* renamed from: i, reason: collision with root package name */
    int f34755i = f34743w;

    /* renamed from: j, reason: collision with root package name */
    int f34756j = f34744x;

    /* renamed from: k, reason: collision with root package name */
    int f34757k = 25;

    /* renamed from: l, reason: collision with root package name */
    int f34758l = 100;

    /* renamed from: m, reason: collision with root package name */
    int f34759m = 100;

    /* renamed from: n, reason: collision with root package name */
    int[] f34760n = B;

    /* renamed from: s, reason: collision with root package name */
    static final int[] f34739s = {8000000, 4000000, 2000000};

    /* renamed from: t, reason: collision with root package name */
    static final Integer[] f34740t = {0, 2, 1, null};
    static final int[] B = {5, 1, 0};

    private MediaFormat a(int i13, int i14) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f34747a, i13, i14);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("frame-rate", this.f34748b);
        createVideoFormat.setInteger("i-frame-interval", this.f34749c);
        return createVideoFormat;
    }

    public MediaFormat[] a(int i13, int i14, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaFormat[] mediaFormatArr;
        if (this.f34751e.length > 0) {
            ArrayList arrayList = new ArrayList();
            int i15 = 0;
            while (true) {
                Integer[] numArr = this.f34751e;
                if (i15 >= numArr.length) {
                    break;
                }
                Integer num = numArr[i15];
                if (num == null || codecCapabilities.getEncoderCapabilities().isBitrateModeSupported(num.intValue())) {
                    arrayList.add(num);
                }
                i15++;
            }
            mediaFormatArr = new MediaFormat[this.f34750d.length * arrayList.size()];
            for (int i16 = 0; i16 < this.f34750d.length; i16++) {
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    int size = (arrayList.size() * i16) + i17;
                    MediaFormat a13 = a(i13, i14);
                    mediaFormatArr[size] = a13;
                    a13.setInteger("bitrate", this.f34750d[i16]);
                    if (arrayList.get(i17) != null) {
                        mediaFormatArr[size].setInteger("bitrate-mode", ((Integer) arrayList.get(i17)).intValue());
                    }
                }
            }
        } else {
            mediaFormatArr = new MediaFormat[this.f34750d.length];
            for (int i18 = 0; i18 < this.f34750d.length; i18++) {
                MediaFormat a14 = a(i13, i14);
                mediaFormatArr[i18] = a14;
                a14.setInteger("bitrate", this.f34750d[i18]);
            }
        }
        return mediaFormatArr;
    }

    public MediaFormat a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.f34753g, this.f34754h, 1);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("channel-mask", 16);
        createAudioFormat.setInteger("bitrate", this.f34755i);
        createAudioFormat.setInteger("channel-count", 1);
        return createAudioFormat;
    }
}
