package com.dreamapp.theClubFactory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.HorizontalScrollView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.ScrollView;
import de.hdodenhof.circleimageview.*;
import android.widget.TextView;
import android.widget.ImageView;
import com.example.flatdialoglibrary.dialog.FlatDialog;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebViewClient;
import android.view.View;
import com.example.flatdialoglibrary.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class WebviewActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	
	private LinearLayout linear3;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear1;
	private WebView webview1;
	private ProgressBar progressbar2;
	private LinearLayout linear2;
	private Button button1;
	private Button button2;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;

	private LinearLayout _drawer_linear14;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear7;
	private CircleImageView _drawer_img;
	private TextView _drawer_textview1;
	private TextView _drawer_textview2;
	private LinearLayout _drawer_linear_myprofile;
	private LinearLayout _drawer_linear_anno;
	private LinearLayout _drawer_linear_exam;
	private LinearLayout _drawer_linear_liveclass;
	private LinearLayout _drawer_linear_live_time;
	private LinearLayout _drawer_linear15;
	private LinearLayout _drawer_linear_call_us;
	private LinearLayout _drawer_linear_wp_us;
	private LinearLayout _drawer_linear_msg_us;
	private LinearLayout _drawer_linear16;
	private LinearLayout _drawer_linear17;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview6;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview7;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview12;
	private TextView _drawer_textview15;
	private ImageView _drawer_imageview15;
	private TextView _drawer_textview18;
	private ImageView _drawer_imageview14;
	private TextView _drawer_textview17;
	private ImageView _drawer_imageview19;
	private TextView _drawer_textview22;
	
	private FlatDialog flat;
	private Intent iapi = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.webview);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(WebviewActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear3 = findViewById(R.id.linear3);
		hscroll1 = findViewById(R.id.hscroll1);
		linear1 = findViewById(R.id.linear1);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		progressbar2 = findViewById(R.id.progressbar2);
		linear2 = findViewById(R.id.linear2);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		_drawer_linear14 = _nav_view.findViewById(R.id.linear14);
		_drawer_vscroll1 = _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear13 = _nav_view.findViewById(R.id.linear13);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_linear7 = _nav_view.findViewById(R.id.linear7);
		_drawer_img = _nav_view.findViewById(R.id.img);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_linear_myprofile = _nav_view.findViewById(R.id.linear_myprofile);
		_drawer_linear_anno = _nav_view.findViewById(R.id.linear_anno);
		_drawer_linear_exam = _nav_view.findViewById(R.id.linear_exam);
		_drawer_linear_liveclass = _nav_view.findViewById(R.id.linear_liveclass);
		_drawer_linear_live_time = _nav_view.findViewById(R.id.linear_live_time);
		_drawer_linear15 = _nav_view.findViewById(R.id.linear15);
		_drawer_linear_call_us = _nav_view.findViewById(R.id.linear_call_us);
		_drawer_linear_wp_us = _nav_view.findViewById(R.id.linear_wp_us);
		_drawer_linear_msg_us = _nav_view.findViewById(R.id.linear_msg_us);
		_drawer_linear16 = _nav_view.findViewById(R.id.linear16);
		_drawer_linear17 = _nav_view.findViewById(R.id.linear17);
		_drawer_imageview7 = _nav_view.findViewById(R.id.imageview7);
		_drawer_textview8 = _nav_view.findViewById(R.id.textview8);
		_drawer_imageview4 = _nav_view.findViewById(R.id.imageview4);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_imageview5 = _nav_view.findViewById(R.id.imageview5);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_imageview6 = _nav_view.findViewById(R.id.imageview6);
		_drawer_textview7 = _nav_view.findViewById(R.id.textview7);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_textview9 = _nav_view.findViewById(R.id.textview9);
		_drawer_imageview12 = _nav_view.findViewById(R.id.imageview12);
		_drawer_textview15 = _nav_view.findViewById(R.id.textview15);
		_drawer_imageview15 = _nav_view.findViewById(R.id.imageview15);
		_drawer_textview18 = _nav_view.findViewById(R.id.textview18);
		_drawer_imageview14 = _nav_view.findViewById(R.id.imageview14);
		_drawer_textview17 = _nav_view.findViewById(R.id.textview17);
		_drawer_imageview19 = _nav_view.findViewById(R.id.imageview19);
		_drawer_textview22 = _nav_view.findViewById(R.id.textview22);
		
		//webviewOnProgressChanged
		webview1.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		//OnDownloadStarted
		webview1.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				DownloadManager.Request webview1a = new DownloadManager.Request(Uri.parse(url));
				String webview1b = CookieManager.getInstance().getCookie(url);
				webview1a.addRequestHeader("cookie", webview1b);
				webview1a.addRequestHeader("User-Agent", userAgent);
				webview1a.setDescription("Downloading file...");
				webview1a.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				webview1a.allowScanningByMediaScanner(); webview1a.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); webview1a.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				DownloadManager webview1c = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				webview1c.enqueue(webview1a);
				showMessage("Downloading File....");
				BroadcastReceiver onComplete = new BroadcastReceiver() {
					public void onReceive(Context ctxt, Intent intent) {
						showMessage("Download Complete!");
						unregisterReceiver(this);
						
					}};
				registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				linear3.setVisibility(View.VISIBLE);
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				linear1.setVisibility(View.GONE);
				linear2.setVisibility(View.VISIBLE);
				webview1.setVisibility(View.VISIBLE);
				linear3.setVisibility(View.GONE);
				super.onPageFinished(_param1, _param2);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/categories");
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-ethnic-wear-sarees");
			}
		});
		
		button4.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-western-wear-tops-tees-shirts");
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-jewellery-earrings");
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-watches-wearables-watches");
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-lingerie-nightwear-swimwear-beachwear");
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/women-maternity-nightwear");
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp/list/beauty-and-personal-care-skin-and-beauty-makeup");
			}
		});
		
		_drawer_linear_myprofile.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp");
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_anno.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/checkout/cart");
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_exam.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/myorders");
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_liveclass.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://myshopprime.com/wallet");
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_live_time.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear_call_us.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final FlatDialog flatd = new FlatDialog(WebviewActivity.this);
				flatd.setTitle("Call Us!");
				flatd.setSubtitle("Hope You Like Our Services, If You Want To Know More Call Us.");
				flatd.setFirstButtonText("Contact- Seller");
				flatd.setSecondButtonText("Contact- Owner");
				flatd.setIcon(R.drawable.ic_phone_white_1);
				flatd.setBackgroundColor(0xFFF44336);
				flatd.withFirstButtonListner(new View.OnClickListener() {
					@Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_DIAL);
						iapi.setData(Uri.parse("tel:+917088741804"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.withSecondButtonListner(new View.OnClickListener() { @Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_DIAL);
						iapi.setData(Uri.parse("tel:+917088741804"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.setCancelable(true);
				flatd.show();
			}
		});
		
		_drawer_linear_wp_us.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final FlatDialog flatd = new FlatDialog(WebviewActivity.this);
				flatd.setTitle("Contact Us!");
				flatd.setSubtitle("We Are Also Available On Whatsapp Ping Us Today Now!");
				flatd.setFirstButtonText("Contact- Seller");
				flatd.setSecondButtonText("Contact- Owner");
				flatd.setIcon(R.drawable.ic_phone_white_3);
				flatd.setBackgroundColor(0xFFF44336);
				flatd.withFirstButtonListner(new View.OnClickListener() {
					@Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_VIEW);
						iapi.setData(Uri.parse("whatsapp://send?text=&phone=+917088741804d"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.withSecondButtonListner(new View.OnClickListener() { @Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_VIEW);
						iapi.setData(Uri.parse("whatsapp://send?text=&phone=+917088741804d"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.setCancelable(true);
				flatd.show();
			}
		});
		
		_drawer_linear_msg_us.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final FlatDialog flatd = new FlatDialog(WebviewActivity.this);
				flatd.setTitle("Message Us!");
				flatd.setSubtitle("Hope You Like Our Services, If You Want To Know More Message Us.");
				flatd.setFirstButtonText("Contact- Seller");
				flatd.setSecondButtonText("Contact- Owner");
				flatd.setIcon(R.drawable.ic_phone_white_2);
				flatd.setBackgroundColor(0xFFF44336);
				flatd.withFirstButtonListner(new View.OnClickListener() {
					@Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_VIEW);
						iapi.setData(Uri.parse("smsto:+917088741804"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.withSecondButtonListner(new View.OnClickListener() { @Override public void onClick(View view) {
						iapi.setAction(Intent.ACTION_VIEW);
						iapi.setData(Uri.parse("smsto:+917088741804"));
						startActivity(iapi);
						flatd.dismiss();
					} });
				flatd.setCancelable(true);
				flatd.show();
			}
		});
		
		_drawer_linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent sendIntent = new Intent(); sendIntent.setAction(Intent.ACTION_SEND); sendIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.dreamapp.theclubfactory"); sendIntent.setType("text/plain"); startActivity(sendIntent);
			}
		});
	}
	
	private void initializeLogic() {
		hscroll1.setHorizontalScrollBarEnabled(false);
		linear1.setVisibility(View.VISIBLE);
		linear2.setVisibility(View.GONE);
		webview1.setVisibility(View.GONE);
		linear3.setVisibility(View.GONE);
		webview1.loadUrl("https://myshopprime.com/The.Club.Factory/dx8oemp");
		webview1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
	}
	
	@Override
	public void onBackPressed() {
		if (webview1.canGoBack()) {
			webview1.goBack();
		}
		else {
			finishAffinity();
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
