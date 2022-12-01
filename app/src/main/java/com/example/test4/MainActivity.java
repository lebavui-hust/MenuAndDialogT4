package com.example.test4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActionMode(new ActionMode.Callback() {
                    @Override
                    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                        getMenuInflater().inflate(R.menu.context_menu, menu);
                        return true;
                    }

                    @Override
                    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                        return false;
                    }

                    @Override
                    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                        int id = menuItem.getItemId();
                        if (id == R.id.action_edit) {
                            Log.v("TAG", "Action edit");
                            actionMode.finish();
                            return true;
                        } else if (id == R.id.action_share) {
                            Log.v("TAG", "Action share");
                            actionMode.finish();
                            return true;
                        } else if (id == R.id.action_download) {
                            Log.v("TAG", "Action download");
                            actionMode.finish();
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public void onDestroyActionMode(ActionMode actionMode) {

                    }
                });
            }
        });


        ListView listView = findViewById(R.id.listView);
        items = new ArrayList<>();
        for (int i = 0; i < 50; i++)
            items.add("Item " + i);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);

        findViewById(R.id.button_show_popup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
                popupMenu.getMenuInflater().inflate(R.menu.context_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();
                        if (id == R.id.action_edit) {
                            Log.v("TAG", "Action edit");
                            return true;
                        } else if (id == R.id.action_share) {
                            Log.v("TAG", "Action share");
                            return true;
                        } else if (id == R.id.action_download) {
                            Log.v("TAG", "Action download");
                            return true;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        findViewById(R.id.button_show_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Error")
//                        .setIcon(R.drawable.ic_baseline_favorite_24)
//                        .setMessage("Failed to download data")
//                        .setPositiveButton("OK", null)
//                        .create();
//                dialog.setCancelable(false);
//                dialog.setCanceledOnTouchOutside(false);
//                dialog.show();

//                View dialogView = getLayoutInflater().inflate(R.layout.dialog_layout, null);
//
//                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
//                        .setView(dialogView)
//                        .create();
//
//                EditText editText = dialogView.findViewById(R.id.edit_text);
//                dialogView.findViewById(R.id.button_ok).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        String name = editText.getText().toString();
//                        // Xu ly du lieu
//                        dialog.dismiss();
//                    }
//                });
//                dialogView.findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog.dismiss();
//                    }
//                });
//
//                dialog.show();

                List<String> items = new ArrayList<>();
                for (int i = 0; i < 50; i++)
                    items.add("Item " + i);
                boolean[] checkItems = new boolean[items.size()];

//                new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Select an item")
//                        .setItems(items.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                            }
//                        })
//                        .setPositiveButton("OK", null)
//                        .create().show();

//                new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Select an item")
//                        .setSingleChoiceItems(items.toArray(new CharSequence[0]), 0, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                            }
//                        })
//                        .setPositiveButton("OK", null)
//                        .create().show();

//                new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("Select an item")
//                        .setMultiChoiceItems(items.toArray(new CharSequence[0]), checkItems, new DialogInterface.OnMultiChoiceClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
//
//                            }
//                        })
//                        .setPositiveButton("OK", null)
//                        .create().show();

//                Calendar c = Calendar.getInstance();
//                int mYear = c.get(Calendar.YEAR);
//                int mMonth = c.get(Calendar.MONTH);
//                int mDay = c.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,
//                        new DatePickerDialog.OnDateSetListener() {
//                            @Override
//                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
//
//                            }
//                        }, mYear, mMonth, mDay);
//                dialog.show();

                Calendar c = Calendar.getInstance();
                int mHour = c.get(Calendar.HOUR);
                int mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog dialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int i, int i1) {

                            }
                        }, mHour, mHour, true);
                dialog.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        int pos = ((AdapterView.AdapterContextMenuInfo)item.getMenuInfo()).position;
        if (id == R.id.action_edit) {
            Log.v("TAG", "Action edit " + items.get(pos));
            return true;
        } else if (id == R.id.action_share) {
            Log.v("TAG", "Action share " + items.get(pos));
            return true;
        } else if (id == R.id.action_download) {
            Log.v("TAG", "Action download " + items.get(pos));
            return true;
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_download) {
            Log.v("TAG", "Download action");
            return true;
        } else if (id == R.id.action_share) {
            Log.v("TAG", "Share action");
            return true;
        } else if (id == R.id.action_favorite) {
            Log.v("TAG", "Favorite action");
            return true;
        } else if (id == R.id.action_settings) {
            Log.v("TAG", "Settings action");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}