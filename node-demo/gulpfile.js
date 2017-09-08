var gulp = require('gulp')
var concat = require('gulp-concat')
var uglify = require('gulp-uglify')
var webserver = require('gulp-webserver')

var paths = {
  src: "src",
  srcHTML: "src/**/*.html",
  srcCSS: "src/**/*.css",
  srcJS: "src/**/*.js",
  distHTML: "dist",
  distCSS: "dist",
  distJS: "dist",
}

gulp.task('default', function() {
  console.log("Hello from gulp")
})

gulp.task('html', function () {
  return gulp.src(paths.srcHTML).pipe(gulp.dest(paths.distHTML));
});

gulp.task('css', function () {
  return gulp.src(paths.srcCSS).pipe(gulp.dest(paths.distCSS));
});

gulp.task('js', function () {
  return gulp.src(paths.srcJS).pipe(gulp.dest(paths.distJS));
});

gulp.task('copy', ['html', 'css', 'js']);
gulp.task('serve', ['copy'], function () {
  return gulp.src(paths.src)
    .pipe(webserver({
      port: 3000,
      livereload: true,
      open: true
    }));
});

