package com.amazonaws.auth;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f28550m = new byte[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Log f28551n = LogFactory.a(AwsChunkedEncodingInputStream.class);

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f28552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28553b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f28554c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28555d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28556e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28557f;

    /* renamed from: g, reason: collision with root package name */
    public String f28558g;

    /* renamed from: h, reason: collision with root package name */
    public final AWS4Signer f28559h;

    /* renamed from: i, reason: collision with root package name */
    public ChunkContentIterator f28560i;

    /* renamed from: j, reason: collision with root package name */
    public DecodedStreamBuffer f28561j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28562k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28563l = false;

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.f28552a = null;
        int i13 = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            i13 = Math.max(awsChunkedEncodingInputStream.f28553b, 262144);
            this.f28552a = awsChunkedEncodingInputStream.f28552a;
            this.f28561j = awsChunkedEncodingInputStream.f28561j;
        } else {
            this.f28552a = inputStream;
            this.f28561j = null;
        }
        if (i13 < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f28553b = i13;
        this.f28554c = bArr;
        this.f28555d = str;
        this.f28556e = str2;
        this.f28557f = str3;
        this.f28558g = str3;
        this.f28559h = aWS4Signer;
    }

    public static long e(long j13) {
        return Long.toHexString(j13).length() + 83 + j13 + 2;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public final InputStream d() {
        return this.f28552a;
    }

    public final byte[] f(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Integer.toHexString(bArr.length));
        StringBuilder sb4 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb4.append(this.f28555d);
        sb4.append("\n");
        sb4.append(this.f28556e);
        sb4.append("\n");
        sb4.append(this.f28558g);
        sb4.append("\n");
        AWS4Signer aWS4Signer = this.f28559h;
        sb4.append(BinaryUtils.a(aWS4Signer.hash("")));
        sb4.append("\n");
        sb4.append(BinaryUtils.a(aWS4Signer.hash(bArr)));
        String a13 = BinaryUtils.a(aWS4Signer.sign(sb4.toString(), this.f28554c, SigningAlgorithm.HmacSHA256));
        this.f28558g = a13;
        sb3.append(";chunk-signature=" + a13);
        sb3.append("\r\n");
        try {
            String sb5 = sb3.toString();
            Charset charset = StringUtils.f29048a;
            byte[] bytes = sb5.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to sign the chunked data. ")), e13);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i13) {
        try {
            c();
            if (!this.f28562k) {
                throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
            }
            if (this.f28552a.markSupported()) {
                Log log = f28551n;
                if (log.b()) {
                    log.f("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
                }
                this.f28552a.mark(Integer.MAX_VALUE);
            } else {
                Log log2 = f28551n;
                if (log2.b()) {
                    log2.f("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
                }
                int i14 = this.f28553b;
                DecodedStreamBuffer decodedStreamBuffer = new DecodedStreamBuffer();
                decodedStreamBuffer.f28575d = -1;
                decodedStreamBuffer.f28572a = new byte[i14];
                decodedStreamBuffer.f28573b = i14;
                this.f28561j = decodedStreamBuffer;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return read;
        }
        Log log = f28551n;
        if (log.b()) {
            log.f("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        try {
            c();
            this.f28560i = null;
            this.f28558g = this.f28557f;
            if (this.f28552a.markSupported()) {
                Log log = f28551n;
                if (log.b()) {
                    log.f("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
                }
                this.f28552a.reset();
            } else {
                Log log2 = f28551n;
                if (log2.b()) {
                    log2.f("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
                }
                DecodedStreamBuffer decodedStreamBuffer = this.f28561j;
                if (decodedStreamBuffer == null) {
                    throw new IOException("Cannot reset the stream because the mark is not set.");
                }
                if (decodedStreamBuffer.f28576e) {
                    throw new AmazonClientException("The input stream is not repeatable since the buffer size " + decodedStreamBuffer.f28573b + " has been exceeded.");
                }
                decodedStreamBuffer.f28575d = 0;
            }
            this.f28560i = null;
            this.f28562k = true;
            this.f28563l = false;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j13) {
        int read;
        if (j13 <= 0) {
            return 0L;
        }
        int min = (int) Math.min(262144L, j13);
        byte[] bArr = new byte[min];
        long j14 = j13;
        while (j14 > 0 && (read = read(bArr, 0, min)) >= 0) {
            j14 -= read;
        }
        return j13 - j14;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        boolean z13;
        int i15;
        c();
        bArr.getClass();
        if (i13 < 0 || i14 < 0 || i14 > bArr.length - i13) {
            throw new IndexOutOfBoundsException();
        }
        if (i14 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f28560i;
        int i16 = -1;
        if (chunkContentIterator == null || chunkContentIterator.f28570b >= chunkContentIterator.f28569a.length) {
            if (this.f28563l) {
                return -1;
            }
            byte[] bArr2 = new byte[131072];
            int i17 = 0;
            while (true) {
                z13 = true;
                if (i17 >= 131072) {
                    break;
                }
                DecodedStreamBuffer decodedStreamBuffer = this.f28561j;
                if (decodedStreamBuffer != null && (i15 = decodedStreamBuffer.f28575d) != -1 && i15 < decodedStreamBuffer.f28574c) {
                    decodedStreamBuffer.f28575d = i15 + 1;
                    bArr2[i17] = decodedStreamBuffer.f28572a[i15];
                    i17++;
                } else {
                    int read = this.f28552a.read(bArr2, i17, 131072 - i17);
                    if (read == -1) {
                        break;
                    }
                    DecodedStreamBuffer decodedStreamBuffer2 = this.f28561j;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.f28575d = -1;
                        int i18 = decodedStreamBuffer2.f28574c;
                        int i19 = i18 + read;
                        int i23 = decodedStreamBuffer2.f28573b;
                        if (i19 > i23) {
                            Log log = DecodedStreamBuffer.f28571f;
                            if (log.b()) {
                                log.f("Buffer size " + i23 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
                            }
                            decodedStreamBuffer2.f28576e = true;
                        } else {
                            System.arraycopy(bArr2, i17, decodedStreamBuffer2.f28572a, i18, read);
                            decodedStreamBuffer2.f28574c += read;
                        }
                    }
                    i17 += read;
                }
            }
            if (i17 == 0) {
                this.f28560i = new ChunkContentIterator(f(f28550m));
            } else {
                if (i17 < 131072) {
                    byte[] bArr3 = new byte[i17];
                    System.arraycopy(bArr2, 0, bArr3, 0, i17);
                    bArr2 = bArr3;
                }
                this.f28560i = new ChunkContentIterator(f(bArr2));
                z13 = false;
            }
            this.f28563l = z13;
        }
        ChunkContentIterator chunkContentIterator2 = this.f28560i;
        if (i14 == 0) {
            chunkContentIterator2.getClass();
            i16 = 0;
        } else {
            int i24 = chunkContentIterator2.f28570b;
            byte[] bArr4 = chunkContentIterator2.f28569a;
            if (i24 < bArr4.length) {
                i16 = Math.min(bArr4.length - i24, i14);
                System.arraycopy(bArr4, chunkContentIterator2.f28570b, bArr, i13, i16);
                chunkContentIterator2.f28570b += i16;
            }
        }
        if (i16 > 0) {
            this.f28562k = false;
            Log log2 = f28551n;
            if (log2.b()) {
                log2.f(i16 + " byte read from the stream.");
            }
        }
        return i16;
    }
}
